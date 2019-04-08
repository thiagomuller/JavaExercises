package hibernatedemo;

import hibernatedemo.Model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            System.out.println("Creating new student object...");
            Student tempStudent1 = new Student("Frank", "Castle",
                    "frank.castle@gmail.com");
            Student tempStudent2 = new Student("Billy", "Russo",
                    "billy.russo@gmail.com");
            Student tempStudent3 = new Student("Agent", "Madani",
                    "agent.madani@gmail.com");

            session.beginTransaction();
            System.out.println("Saving the students on db...");
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);
            session.getTransaction().commit();
            System.out.println("Done");
        } finally{
            session.close();
        }

    }
}
