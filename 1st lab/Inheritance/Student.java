package com.example;

public class Student extends Person {
   private String regNo;
   
  

public Student(String name, String regNo) {
	super(name);
	this.regNo = regNo;
}


public String getRegNo() {
	return regNo;
}

public void setRegNo(String regNo) {
	this.regNo = regNo;
}
    
}
