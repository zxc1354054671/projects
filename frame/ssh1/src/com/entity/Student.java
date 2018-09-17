package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity()
@Table(name="student")
public class Student {
	@Id
	@SequenceGenerator(name="seq_student_stuNo",sequenceName="seq_student_stuNo"
		,initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_student_stuNo")
	private Integer stuNo;
	private String name;
	private Character sex;
	private Integer gradeId;
//	@Temporal(TemporalType.DATE)
	private Date birthday;
	
//	private Grade grade;
	public Student() {
		super();
	}
	public Student(Integer stuNo, String name) {
		super();
		this.stuNo = stuNo;
		this.name = name;
	}
	public Integer getStuNo() {
		return stuNo;
	}
	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", name=" + name + ", sex=" + sex
				+ ", gradeId=" + gradeId + ", birthday=" + birthday + "]";
	}
	
}
