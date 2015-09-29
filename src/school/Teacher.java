
package school;

public class Teacher extends Person{
    private double meanIndex;
    private Course theCourse;
    private Course courses[]= new Course[Course.numPeriods];
    //private Student theStudent;
    
    
     public static Teacher addTeacher(String _name, Gender _gender, int _weight, double _mean)
     {
         Teacher temp = new Teacher(_name,_gender,_weight,_mean);
         addPerson(temp);
         return (temp);
                 
     }
     Teacher(String _name, Gender _gender, int _weight, double _mean)
     {
         super(_name,_gender,_weight);
         meanIndex = _mean;
         
     }
//     public void addCourse(Course _course)
//     {
//         if(theCourse==null)
//         {
//             theCourse=_course;
//            _course.addTeacher(this);
//         }
//     }
     public boolean addCourse(Course _course)
     {
         if(!setCourseOK(_course))
             return(false);
         if(!_course.setTeacherOK(this))
             return false;
         _course.setTeacherDoIt(this);
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
     
//     public void addStudent(Student _student)
//     {
//         if(theStudent ==null)
//         {
//             theStudent = _student;
//         _student.addTeacher(this);
//         }
//     }
    
     public void printStudentsNames()
     {
         System.out.println(getName() + " teaches " );
         for(Course temp : courses)
         {
             if(temp!=null)
             {
                 for(int i = 0;i < temp.getNumStudentsInCourse(); i++)
                 {
                     System.out.println(temp.getStudent(i).getName());
                 }
             }
         }
         
     }
     public static void printNames()
     {
         System.out.println("=PrintNamesStudents=");
          for (Person temp : people)
         {
             if( temp instanceof Teacher)
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
     
     public void setMeanIndex(double _mean)
     {
         meanIndex = _mean;
        
     }
     public double getMeanIndex()
     {
         return(meanIndex);
     }
}
