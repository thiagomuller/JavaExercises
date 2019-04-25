package hibernatedemo;

import hibernatedemo.Model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{

            int studentId = 1;

            session = factory.getCurrentSession();
            session.beginTransaction();
            Student myStudent = (Student) session.get(Student.class, studentId);
            System.out.println("Updating student...");
            myStudent.setFirstName("Vlad");

            session.getTransaction().commit();

            System.out.println("Update emails");

            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Student set email='foo@hotmail.com'").executeUpdate();
            session.getTransaction().commit();

            System.out.println("Done");


        } finally{
            session.close();
        }
    }
}
