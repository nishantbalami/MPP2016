package com.ems.data.dao;

import com.ems.baseclasses.Student;

public class StudentDao implements DaoInterface{
	private Student std;
	private static final String FILE_NAME = "students.json";
	public StudentDao(Object obj){
		std = (Student) obj;
	}
	
	@Override
	public void saveNewRecord() {
		System.out.println("Saved");
	}

	@Override
	public void modifyRecord() {
		
	}

	@Override
	public void deleteRecord() {
		
	}

}
