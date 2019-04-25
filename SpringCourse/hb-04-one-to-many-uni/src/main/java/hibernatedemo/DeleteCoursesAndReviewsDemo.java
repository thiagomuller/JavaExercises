package hibernatedemo;

import hibernatedemo.Model.Course;
import hibernatedemo.Model.Instructor;
import hibernatedemo.Model.InstructorDetail;
import hibernatedemo.Model.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCoursesAndReviewsDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Instructor.class)
                                .addAnnotatedClass(InstructorDetail.class)
                                .addAnnotatedClass(Course.class)
                                .addAnnotatedClass(Review.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{

            session.beginTransaction();

            int id = 10;
            Course course = (Course) session.get(Course.class, id);

            session.delete(course);

            session.getTransaction().commit();
            System.out.println("Done");
        } finally{
            factory.close();
        }

    }
}
