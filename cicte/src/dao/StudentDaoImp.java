package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jsfhibernate.pojo.Student;



public class StudentDaoImp implements StudentDao{

	@Override
	public void nuevoModelo(Student student) {
		Session s= null;
		try {
			s=HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
			s.save(student);
			s.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			if (s!=null) {
				s.close();
			}
		}
		
	}

}
