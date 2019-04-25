package hibernatedemo;

import hibernatedemo.Model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{

            int studentId = 2;

            session = factory.getCurrentSession();
            session.beginTransaction();
            Student myStudent = (Student) session.get(Student.class, studentId);
//            System.out.println("Deleting student with id: " + studentId);
//            session.delete(myStudent);

            session.createQuery("delete from Student where id=1").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done");


        } finally{
            session.close();
        }
    }
}
