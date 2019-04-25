package hibernatedemo;

import hibernatedemo.Model.Course;
import hibernatedemo.Model.Instructor;
import hibernatedemo.Model.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchJoinDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Instructor.class)
                                .addAnnotatedClass(InstructorDetail.class)
                                .addAnnotatedClass(Course.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{

            session.beginTransaction();
            int id = 1;
            Instructor tempInstructor =
                    (Instructor) session.get(Instructor.class, id);

            System.out.println("here: Instructor: " + tempInstructor);


            session.getTransaction().commit();

            factory.close();

            System.out.println("The session is now closed\n");

            System.out.println("here: Courses: " + tempInstructor.getCourses());

            System.out.println("here: Done");
        } finally{
//            factory.close();
        }

    }
}
