package hibernatedemo;

import hibernatedemo.Model.Course;
import hibernatedemo.Model.Instructor;
import hibernatedemo.Model.InstructorDetail;
import hibernatedemo.Model.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCoursesAndReviewsDemo {
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

            Course tempCourse = new Course("Pacman - How To Score One Million Points");

            tempCourse.addReview(new Review("Great course!!!"));
            tempCourse.addReview(new Review("Got stuck with the ghosts"));
            tempCourse.addReview(new Review("Cool course"));
            tempCourse.addReview(new Review("I loved this course!"));


            System.out.println("Saving the course: " + tempCourse);
            System.out.println("Also saving the reviews: " + tempCourse.getReviews());
            session.save(tempCourse);
            session.getTransaction().commit();
            System.out.println("Done");
        } finally{
            factory.close();
        }

    }
}
