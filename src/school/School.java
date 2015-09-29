
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
        
        
        Course calc =
        Course.addCourse("Calculus", Course.Type.Math,0);
        Course fit =
        Course.addCourse("Fitness", Course.Type.PE,3);
        Course compSci =
        Course.addCourse("Computer Science", Course.Type.Elective,3);
        Course euro =
        Course.addCourse("AP Euro", Course.Type.History,3);
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
        
        
        compSci.addStudent(allan);
        fit.addStudent(alan);
        carrie.addCourse(euro);
        
        Student Andrew = 
        Student.addStudent("Andrew",Student.Gender.Male,120,11);
        calc.addStudent(Andrew);
        calc.addStudent(carrie);
        System.out.println(Andrew);
        System.out.println(carrie);
        System.out.println(allan);
        
        carrie.printTeachersNames();
        tyson.printStudentsNames();
        System.out.println(yee);
        System.out.println(Andrew.getName());
        
        
         }
}
