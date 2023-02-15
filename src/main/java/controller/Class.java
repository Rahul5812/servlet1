package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.StudentDao;
import dto.Student;

public class Class extends GenericServlet {
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String s1 = arg0.getParameter("std_id");
		int std_id = Integer.parseInt(s1);

		String std_name = arg0.getParameter("std_name");
		String std_branch = arg0.getParameter("std_branch");

		Student student = new Student();
		student.setStd_id(std_id);
		student.setStd_name(std_name);
		student.setStd_branch(std_branch);
		
		StudentDao studentDao = new StudentDao();
		studentDao.insert(student);
	}
}
