package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name ="Student")
@Entity

public class student 
{
	
	@Id
	@Column(name="sid")
  private int sid;
	@Column(name="name")
	private String sname;
	
	@Column (name ="marks")
  private int smarks;
  
public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSmarks() {
	return smarks;
}
public void setSmarks(int smarks) {
	this.smarks = smarks;
}
  
	
	
	
	
	
}
