package hibernatedemo;

import hibernatedemo.Model.Course;
import hibernatedemo.Model.Instructor;
import hibernatedemo.Model.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Instructor.class)
                                .addAnnotatedClass(InstructorDetail.class)
                                .addAnnotatedClass(Course.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{

            Instructor tempInstructor =
                    new Instructor("Tony", "Stark", "tony.stark@gmail.com");

            InstructorDetail tempInstructorDetail =
                    new InstructorDetail(
                            "http:/youtube.com",
                            "Building armors"
                    );
            tempInstructor.setInstructorDetail(tempInstructorDetail);
            session.beginTransaction();

            System.out.println("Saving instructor: " + tempInstructor);
            session.save(tempInstructor);

            session.getTransaction().commit();
            System.out.println("Done");
        } finally{
            factory.close();
        }

    }
}
