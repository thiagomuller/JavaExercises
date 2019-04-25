import com.thiagomuller.PraticingHibernate.Model.Author;
import com.thiagomuller.PraticingHibernate.Model.Comment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Entity;

public class Read {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Comment.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        int id = 1;
        Author author = (Author) session.get(Author.class, id);
//        Comment comment = (Comment) session.get(Comment.class, id);

        System.out.println("Author: " + author);
//        System.out.println("Comment: " + comment);

        session.getTransaction().commit();
        factory.close();
    }
}
