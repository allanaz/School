
package school;
import java.util.ArrayList;
import java.util.Calendar;

public class Person {
    
    
   // public static int numPeople = 10;
   // private static int currentPeopleIndex = 0;
   // private static Person people[]= new Person[numPeople];
    protected static ArrayList<Person> people = new ArrayList<Person>();
    
    enum Gender{
        Male,Female}
    
    private Gender gender;
    private String name;
    private int weight;

    private int birthDay;
    private int birthMonth;
    private int birthYear;
    
     Person()
     {
         name = "none";
         weight= 100;
         gender = Gender.Female;
     }
     Person(String _name, Gender _gender, int _weight)
     {
         name = _name;
         gender= _gender;
         weight = _weight;
     }
     
     public static Person addPerson(String _name, Gender _gender, int _weight)
     {
         Person temp = new Person(_name,_gender,_weight);
        // people[currentPeopleIndex++] = temp;
         people.add(temp);
         return (temp);
                 
     }
     public static void addPerson(Person _person)
     {
         people.add(_person);
     }
     
     public static void printNames()
     {
         System.out.println("===PrintNames===");
//         for(int index = 0; index < people.length;index++)
//         {
//             if(people[index] != null)
//             {
//                 System.out.println(people[index].getName());
//             }
//         }
//         for(int index = 0; index < people.size();index++)
//         {
//             
//                 System.out.println(people.get(index).getName());
//             
//         }
         for (Person temp : people)
         {
             System.out.println(temp.getName());
         }
         System.out.println("==========");
     }
     
     public static void printNames(Gender _gender)
     {
         System.out.println("===PrintNames===");
//         for(int index = 0; index < people.length;index++)
//         {
//             if(people[index] != null)
//             {
//                 System.out.println(people[index].getName());
//             }
//         }
//         for(int index = 0; index < people.size();index++)
//         {
//             
//                 System.out.println(people.get(index).getName());
//             
//         }
         for (Person temp : people)
         {
             if(temp.getGender()== _gender)
             System.out.println(temp.getName());
         }
     }
     
     public void setBirthDate(int _day, int _month, int _year)
     {
         birthDay = _day;
         birthMonth = _month;
         birthYear = _year;
     }
     
     public int getAge()
     {
         Calendar now = Calendar.getInstance();
         int day = now.get(Calendar.DAY_OF_MONTH);
         int month = now.get(Calendar.MONTH)+1;
         int year = now.get(Calendar.YEAR);
         int age;
         if(month<=birthMonth && day<=birthDay)
             age = year - birthYear -1;
         else
             age = year - birthYear ;
             
         return(age);
     }
     
     public String toString()
     {
         return(name + " " + gender + " " + weight);
     }
     
     public void setGender(Gender _gender)
     {
         gender = _gender;
        
     }
     public Gender getGender()
     {
         return(gender);
     }
     
     public void setName(String _name)
     {
         name = _name;
        
     }
     public String getName()
     {
         return(name);
     }
     
     public void setWeight(int _weight)
     {
         weight = _weight;
        
     }
     public int getWeight()
     {
         return(weight);
     }
}
