
package school;

public class Student extends Person{
    private int gradeLevel;
    private Course theCourse;
    private Course courses[]= new Course[Course.numPeriods];
   // private Teacher theTeacher;
    
    
     public static Student addStudent(String _name, Gender _gender, int _weight, int _gradeLevel)
     {
         Student temp = new Student(_name,_gender,_weight,_gradeLevel);
         addPerson(temp);
         return (temp);
                 
     }
     Student(String _name, Gender _gender, int _weight, int _gradeLevel)
     {
         super(_name,_gender,_weight);
         gradeLevel = _gradeLevel;
         
     }
     public boolean addCourse(Course _course)
     {
         if(!setCourseOK(_course))
             return(false);
         if(!_course.setStudentOK(this))
             return false;
         _course.setStudentDoIt(this);
         setCourseDoIt(_course);
         return (true);
     }
     public boolean setCourseOK(Course _course)
     {
         if(courses[_course.getPeriod()] !=null)
             return(false);
         return(true);
     }
     public void setCourseDoIt(Course _course)
     {
         courses[_course.getPeriod()] = _course;
     }
//     public void addTeacher(Teacher _teacher)
//     {
//         if(theTeacher ==null)
//         {
//             theTeacher = _teacher;
//         _teacher.addStudent(this);
//         }
//     }
     
     public void printTeachersNames()
     {
         System.out.println(getName() + " has the following teachers: " );
         for(Course temp : courses)
         {
             if(temp!=null)
             {
                 
                     System.out.println(temp.getTeacher().getName());
                 
             }
         }
     }
     public static void printNames()
     {
         System.out.println("=PrintNamesStudents=");
          for (Person temp : people)
         {
             if( temp instanceof Student)
             System.out.println(temp.getName());
         }
          System.out.println("=============");
     }
     
     public String toString()
     {
         for(int i=0;i<courses.length;i++)
         {
         if(courses[i]!=null)
         {
             
         return(getName() + " " + courses[i].getName() );
         }
         }
         
             return(getName() + " " + "not enrolled in any Course" );
     }
     public void setGradeLevel(int _gradeLevel)
     {
         gradeLevel = _gradeLevel;
        
     }
     public int getGradeLevel()
     {
         return(gradeLevel);
     }
//     public Teacher getTeacher()
//     {
//         return theTeacher;
//     }
     
}
