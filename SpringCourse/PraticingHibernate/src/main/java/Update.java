import com.thiagomuller.PraticingHibernate.Model.Author;
import com.thiagomuller.PraticingHibernate.Model.Comment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Author.class)
                        .addAnnotatedClass(Comment.class)
                        .buildSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();
        int id = 2;
        Author author = (Author) session.get(Author.class, id);

        Comment comment = (Comment) session.get(Comment.class, id);
        comment.setContent("Common Snape, Harry is a very good boy!");

        author.setComment(comment);

        session.save(author);


        session.getTransaction().commit();

        factory.close();

    }
}
