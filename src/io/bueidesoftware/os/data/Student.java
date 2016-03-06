package io.bueidesoftware.os.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.bueidesoftware.os.data.ClassRoom;

public class Student extends Human{
	
	public int grade;
	public List<ClassRoom> classes = new ArrayList<ClassRoom>();
	
	public Student(String firstName, String lastName, int id, int grade){
		super(firstName, lastName, id);
		this.grade = grade;
	}
	
}
