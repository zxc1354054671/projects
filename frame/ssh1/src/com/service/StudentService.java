package com.service;

import java.util.List;

import com.entity.Student;

public interface StudentService {
	List<Student> selectStudents();
	Student selectStudent(Integer stuNo);
	
	void insertByStudent(Student student);
	void updateByStudent(Student student);
	void delete(int stuNo);
	
	long sCountByLikeName(String likeName);
	List<Student> sByLikeName(String likeName,int start,int size);
}
