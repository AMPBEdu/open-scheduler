package io.bueidesoftware.os.data;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Human{
	
	public List<String> qualificationTags = new ArrayList<String>();

	public Teacher(String firstName, String lastName, int id) {
		super(firstName, lastName, id);
	}

}
