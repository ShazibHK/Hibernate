package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		Student_Info student1 = new Student_Info();
		student1.setName("Shazib");

		Student_marks studentMarks = new Student_marks();
		studentMarks.setCS401("70");
		studentMarks.setCS402("70");
		studentMarks.setCS403("70");
		studentMarks.setPL405("60");
		studentMarks.setPL406("60");
		
		SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		
		session.save(student1);
		session.save(studentMarks);

		session.getTransaction().commit();
		session.close();
		sessionfactory.close();

	}

}
