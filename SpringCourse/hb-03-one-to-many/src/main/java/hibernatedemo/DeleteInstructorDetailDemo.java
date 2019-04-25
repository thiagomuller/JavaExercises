package hibernatedemo;

import hibernatedemo.Model.Instructor;
import hibernatedemo.Model.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDetailDemo {
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
            InstructorDetail tempInstructorDetail =
                    (InstructorDetail) session.get(InstructorDetail.class, id);

            System.out.println("temInstructorDetail: " + tempInstructorDetail);

            System.out.println("Associated instructor: " + tempInstructorDetail.getInstructor());

            System.out.println("Deleting tempInstructDetail: "
                    + tempInstructorDetail);

            //Break the bidirectional reference if you want to detail without cascate
            tempInstructorDetail.getInstructor().setInstructorDetail(null);
            session.delete(tempInstructorDetail);
            session.delete(tempInstructorDetail);

            session.getTransaction().commit();
            System.out.println("Done");
        } catch(NullPointerException n){
            n.printStackTrace();
        }finally{
            session.close();
            factory.close();
        }

    }
}
