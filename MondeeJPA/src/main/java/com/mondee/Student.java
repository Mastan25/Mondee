package com.mondee;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Student {
		
		@Id
		private int sid;
		private String name;
		private int marks;
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		
	}