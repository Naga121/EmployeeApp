package com.naga.git;

public class EmployeeDetails {
	private int eid;
	private String ename;
	private float esal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	

}
