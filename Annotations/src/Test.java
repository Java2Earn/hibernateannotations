import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
public class Test {
	public static void main(String[] args) {
		Session s = new AnnotationConfiguration().configure()
				.buildSessionFactory().openSession();
		Emp e = new Emp();
		e.setEid(1);
		e.setEname("sandeep");
		e.setEmail("gmail");
		s.save(e);
		Transaction t = s.beginTransaction();
		t.commit();
	}
}
