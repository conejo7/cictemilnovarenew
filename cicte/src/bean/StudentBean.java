package bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jsfhibernate.pojo.Student;


import dao.StudentDao;
import dao.StudentDaoImp;



@ManagedBean (name = "studentBeanok")
@SessionScoped
public class StudentBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Student student;
	private List<Student> listaStudents;
	
	public StudentBean() {
		
	}

	public void nuevoModelo() {
		StudentDao obj= new StudentDaoImp();
		obj.nuevoModelo(student);
		this.student = new Student();
	}
	
	
	
}
