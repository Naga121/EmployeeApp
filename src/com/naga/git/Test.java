package com.naga.git;

public class Test {

	public static void main(String[] args) {
		EmployeeDetails ed=new EmployeeDetails();
		ed.setEid(10);
		ed.setEname("Naga");
		ed.setEsal(20.0f);
		System.out.println(ed.getEid()+","+ed.getEname()+","+ed.getEsal());

	}

}
