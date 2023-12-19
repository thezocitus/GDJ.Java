package com.winter.study6.ex2;

import java.io.IOException;
import java.util.ArrayList;

import com.winter.study4.util.ex1.StudentDTO;
import com.winter.study4.util.ex1.StudentView;

public class StudentController {
	
	
	public void start() {
		StudentDAO studentDAO = new StudentDAO();
		StudentView view = new StudentView();
		ArrayList<StudentDTO>  ar = new ArrayList<>();
		
		try {
			ar = studentDAO.getstudent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		view.view(ar);
	}
	
}
