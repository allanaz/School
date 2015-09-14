
package school;

public class School {

    public static void main(String[] args) {
        Person joe =
        Person.addPerson("Joe",Person.Gender.Male,120);
        Person allan =
        Person.addPerson("Allan",Person.Gender.Male,120);
        Person carrie =
        Person.addPerson("Carrie",Person.Gender.Female,100);
        Person.printNames();
        
        System.out.println(allan);
        
        Person.printNames(Person.Gender.Male);
    }
}
