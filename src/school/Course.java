
package school;
import java.util.ArrayList;

public class Course {
    
    private static ArrayList<Course> people = new ArrayList<Course>();
    
    enum Type{
        Math,Science, English, History, Language, Elective, PE}
    
    private Type type;
    private String name;
    private int period;
    //private Student theStudent;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Teacher theTeacher;
    public static final int numPeriods = 4;
    
    Course()
     {
         name = "none";
         period= 0;
         type = Type.Elective;
     }
     Course(String _name, Type _type, int _period)
     {
         name = _name;
         type= _type;
         period = _period;
     }
//     public void addStudent(Student _student)
//     {
//         if(theStudent ==null)
//         {
//             theStudent = _student;
//         _student.addCourse(this);
//         }
//     }
//     public void addTeacher(Teacher _teacher)
//     {
//         if(theTeacher ==null)
//         {
//             theTeacher = _teacher;
//         _teacher.addCourse(this);
//         }
//     }
     public static Course addCourse(String _name, Type _gender, int _weight)
     {
         Course temp = new Course(_name,_gender,_weight);
        // people[currentPeopleIndex++] = temp;
         people.add(temp);
         return (temp);
                 
     }
     
     ////////////////////////////
     public boolean addStudent(Student _student)
     {
         if(!setStudentOK(_student))
             return(false);
         if(!_student.setCourseOK(this))
             return false;
         _student.setCourseDoIt(this);
         setStudentDoIt(_student);
         return (true);
     }
     public boolean setStudentOK(Student _student)
     {
         if(students.contains(_student))
             return false;
         return true;
     }
     public void setStudentDoIt(Student _student)
     {
         students.add(_student);
     }
     
     
     //////////////
     public boolean addTeacher(Teacher _teacher)
     {
         if(!setTeacherOK(_teacher))
             return(false);
         if(!_teacher.setCourseOK(this))
             return false;
         _teacher.setCourseDoIt(this);
         setTeacherDoIt(_teacher);
         return (true);
     }
     public boolean setTeacherOK(Teacher _teacher)
     {
         if(theTeacher == _teacher)
             return false;
         return true;
     }
     public void setTeacherDoIt(Teacher _teacher)
     {
         theTeacher = _teacher;
     }
     //////////////////////////////////
     
     
      public static void printNames()
     {
         System.out.println("===PrintNames===");
          for (Course temp : people)
         {
             
             System.out.println(temp.getName());
         }
     }
     
     public static void printNames(Type _gender)
     {
         System.out.println("===PrintNames===");
          for (Course temp : people)
         {
             if(temp.getType()== _gender)
             System.out.println(temp.getName());
         }
     }
     
      public String toString()
     {
         return(name + " " + type + " " + period);
     }
     
     public void setType(Type _type)
     {
         type = _type;
        
     }
     public Type getType()
     {
         return(type);
     }
     
     public void setName(String _name)
     {
         name = _name;
        
     }
     public String getName()
     {
         return(name);
     }
     
     public void setPeriod(int _period)
     {
         period = _period;
        
     }
     public int getPeriod()
     {
         return(period);
     }
     public Teacher getTeacher()
     {
         return theTeacher;
     }
     public int getNumStudentsInCourse()
     {
         return(students.size());
     }
      public Student getStudent(int _i)
     {
         return students.get(_i);
     }
}
