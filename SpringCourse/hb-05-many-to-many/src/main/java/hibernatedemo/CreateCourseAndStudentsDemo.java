package hibernatedemo;

import hibernatedemo.Model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndStudentsDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Instructor.class)
                                .addAnnotatedClass(InstructorDetail.class)
                                .addAnnotatedClass(Course.class)
                                .addAnnotatedClass(Review.class)
                                .addAnnotatedClass(Student.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{

            session.beginTransaction();

            Course tempCourse = new Course("Pacman - How To Score One Million Points");
            System.out.println("I'm saving the course: " + tempCourse);
            session.save(tempCourse);
            System.out.println("Course saved.\n");

            Student student1 = new Student("John", "Wick", "john.wick@gmail.com");
            Student student2 = new Student("Anayami", "Rey", "ayanami.rey@gmail.com");

            tempCourse.addStudent(student1);
            tempCourse.addStudent(student2);

            System.out.println("Saving students...");
            session.save(student1);
            session.save(student2);

            System.out.println("Students saved: " + tempCourse.getStudents());

            session.getTransaction().commit();
            System.out.println("Done");
        } finally{
            factory.close();
        }

    }
}
