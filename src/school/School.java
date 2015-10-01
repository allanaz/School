
package school;

public class School {

    public static void main(String[] args) {
        Person joe =
        Person.addPerson("Joe",Person.Gender.Male,120);
        Student allan =
        Student.addStudent("Allan",Person.Gender.Male,120,11);
        Student carrie =
        Student.addStudent("Carrie",Person.Gender.Female,100,11);
        Student alan =
        Student.addStudent("Alan",Person.Gender.Male,130,11);
        Student.printNames();
        Person.printNames(Person.Gender.Male);
        Teacher yee =
        Teacher.addTeacher("Mr. Yee", Person.Gender.Male,145,5.0);
        Teacher abruzzo =
        Teacher.addTeacher("Mr. Abruzzo", Person.Gender.Male,145,5.0);
        Teacher tyson =
        Teacher.addTeacher("Mr. Tyson", Person.Gender.Male,145,5.0);
        Teacher kania =
        Teacher.addTeacher("Mrs. Kania", Person.Gender.Female,145,5.0);
        Teacher fennel =
        Teacher.addTeacher("Mrs. Fennel", Person.Gender.Female,130,3.0);
        
        
        Course calc =
        Course.addCourse("Calculus", Course.Type.Math,0,true);
        Course fit =
        Course.addCourse("Fitness", Course.Type.PE,3,false);
        Course compSci =
        Course.addCourse("Computer Science", Course.Type.Elective,3,false);
        Course music =
        Course.addCourse("Music", Course.Type.Elective,2,false);
        Course steelDrum =
        Course.addCourse("Steel Drum", Course.Type.Elective,1,false);
        Course euro =
        Course.addCourse("AP Euro", Course.Type.History,3,true);
        Course.printNames();
        
        System.out.println(calc);

        allan.setBirthDate(28, 6, 1999);
        System.out.println(allan.getAge());
        joe.setBirthDate(28, 9, 1999);
        System.out.println(joe.getAge());
        carrie.setBirthDate(17, 9, 1999);
        System.out.println(carrie.getAge());
        
        
                

        
        yee.addCourse(compSci);
        tyson.addCourse(calc);
        fit.addTeacher(abruzzo);
        euro.addTeacher(kania);
        fennel.addCourse(steelDrum);
        fennel.addCourse(music);
        
        
        compSci.addStudent(allan,4.0);
        compSci.addStudent(alan,3.9);
        carrie.addCourse(euro,4.5);
        allan.addCourse(calc,5.0);
        
        Student Andrew = 
        Student.addStudent("Andrew",Student.Gender.Male,120,11);
        calc.addStudent(Andrew,3.0);
        calc.addStudent(carrie,4.9);
        System.out.println(Andrew);
        System.out.println(carrie);
        System.out.println(allan);
        
        carrie.printTeachersNames();
        tyson.printStudentsNames();
        System.out.println(yee);
        System.out.println(Andrew.getName());
        System.out.println("Carrie's GPA is " + carrie.getGPA());
        Student.printStudentNamesGPAGreaterThan(4.9);
        System.out.println(Student.getHighestGPA().getName()+ " has the best GPA");
        System.out.println(Teacher.getMostElectives().getName()+ " has most electives");
        yee.printStudentsNamesInGrade(11);
        Student.printHonorsStudents();
         }
}
