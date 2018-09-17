package iclass;

import java.io.Serializable;

public class Student implements Serializable{
	private String id;
	private String name;
	private boolean sex;
	private int age;
//	Student stuArr[]={
//			new Student("1", "stu1", true, 10),
//			new Student("2", "stu2", true, 10),
//			new Student("3", "stu3", true, 10),
//			
//	};
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, boolean sex, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the sex
	 */
	public boolean isSex() {
		return sex;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return id + "\t" + name + "\t" + (sex?"ÄÐ":"Å®") + "\t" + age;
	}
	
	
}
