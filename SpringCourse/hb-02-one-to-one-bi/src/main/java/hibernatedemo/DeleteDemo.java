package hibernatedemo;

import hibernatedemo.Model.Instructor;
import hibernatedemo.Model.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Instructor.class)
                                .addAnnotatedClass(InstructorDetail.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();

            int id = 2;
            Instructor tempInstructor =
                    (Instructor) session.get(Instructor.class, id);
            System.out.println("Found instructor: " + tempInstructor);

            if (tempInstructor != null) {

                System.out.println("Deleting: " + tempInstructor);
                //Note: this should also delete instructor detail related row
                //Because of CascadeType.ALL
                session.delete(tempInstructor);
            }

            session.getTransaction().commit();
            System.out.println("Done");
        } finally{
            session.close();
        }

    }
}
