import com.thiagomuller.PraticingHibernate.Model.Author;
import com.thiagomuller.PraticingHibernate.Model.Comment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.source.annotations.entity.ConfiguredClass;

public class Delete {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Comment.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        int id = 3;

        session.beginTransaction();
        Comment comment = (Comment) session.get(Comment.class, id);
        Author author = (Author) session.get(Author.class, id);
        author.setComment(comment);

        session.delete(author);

        session.getTransaction().commit();

        factory.close();
    }
}
