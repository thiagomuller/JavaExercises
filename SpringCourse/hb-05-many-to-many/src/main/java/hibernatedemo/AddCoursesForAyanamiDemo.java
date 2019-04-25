package hibernatedemo;

import hibernatedemo.Model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddCoursesForAyanamiDemo {
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

            int id = 2;
            Student ayanami = (Student) session.get(Student.class, id);

            Course eva1= new Course("How to pilot EVAs vol 1");
            Course eva2 = new Course("How to pilot EVAs vol 2");
            Course evaAdvanced = new Course("How to pilot EVAs, advanced guide");

            eva1.addStudent(ayanami);
            eva2.addStudent(ayanami);
            evaAdvanced.addStudent(ayanami);

            session.save(eva1);
            session.save(eva2);
            session.save(evaAdvanced);


            session.getTransaction().commit();
            System.out.println("Done");
        } finally{
            factory.close();
        }

    }
}
