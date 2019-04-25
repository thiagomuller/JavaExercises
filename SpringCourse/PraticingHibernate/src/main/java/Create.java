import com.thiagomuller.PraticingHibernate.Model.Author;
import com.thiagomuller.PraticingHibernate.Model.Comment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Comment.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
//        Comment comment = new Comment("Harry Potter is an insolent boy");
//        Author author = new Author("Severo", "Snape", "severo.snape@hogwarts.com");
        Comment comment = new Comment("Hello Harry, would like some tea?");
        Author author = new Author("Rubeus", "Hagrid", "rubeus.hagrid@hogwarts.com");
        comment.setAuthor(author);

        session.beginTransaction();
        session.save(comment);

        session.getTransaction().commit();

        factory.close();

    }
}
