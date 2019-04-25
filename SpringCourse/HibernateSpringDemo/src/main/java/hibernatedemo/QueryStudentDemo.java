package hibernatedemo;

import hibernatedemo.Model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Student.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{

            session.beginTransaction();

            List<Student> students = session.createQuery("from Student").list();
            displayStudents(students);

            List<Student> namedRobert =
                   session.createQuery("from Student s where s.firstName = 'Robert'").list();
            System.out.println("Students whose first name is Robert");
            displayStudents(namedRobert);

            List<Student> firstOrLastName =
                    session.createQuery("from Student s where"
                    + " s.lastName='DeNiro' OR s.firstName='Alucard'").list();
            System.out.println("First or lastname");
            displayStudents(firstOrLastName);

            List<Student> likeGmail = session.createQuery("from Student s where s.email"
            + " LIKE '%gmail.com'").list();
            System.out.println("The like query");
            displayStudents(likeGmail);

            session.getTransaction().commit();

            System.out.println("Done");
        } finally{
            session.close();
        }
    }

    public static void displayStudents(List students){
        for (Object student : students) {
            System.out.println(student);
        }
    }
}
