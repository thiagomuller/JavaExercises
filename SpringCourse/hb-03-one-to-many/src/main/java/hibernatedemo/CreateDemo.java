package hibernatedemo;

import hibernatedemo.Model.Instructor;
import hibernatedemo.Model.InstructorDetail;
import hibernatedemo.Model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Instructor.class)
                                .addAnnotatedClass(InstructorDetail.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
//            Instructor tempInstructor =
//                    new Instructor("Chad", "Darby", "darby@gmail.com");
//
//            InstructorDetail tempInstructorDetail =
//                    new InstructorDetail(
//                            "http:/luv2code.com/youtube",
//                            "Coding"
//                    );
            Instructor tempInstructor =
                    new Instructor("Madhu", "Patel", "madhu@gmail.com");

            InstructorDetail tempInstructorDetail =
                    new InstructorDetail(
                            "http:/youtube.com",
                            "Guitar"
                    );
            tempInstructor.setInstructorDetail(tempInstructorDetail);
            session.beginTransaction();

            System.out.println("Saving instructor: " + tempInstructor);
            session.save(tempInstructor);

            session.getTransaction().commit();
            System.out.println("Done");
        } finally{
            session.close();
        }

    }
}
