package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;
import com.entity.Student;
import com.service.StudentService;
@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao sdi;
	@Override
	public List<Student> selectStudents() {
		return sdi.selectStudents();
	}

	@Override
	public void insertByStudent(Student student) {
		sdi.insertByStudent(student);
	}

	@Override
	public void updateByStudent(Student student) {
		sdi.updateByStudent(student);
	}

	@Override
	public void delete(int stuNo) {
		sdi.delete(stuNo);
	}

	@Override
	public Student selectStudent(Integer stuNo) {
		return sdi.selectStudent(stuNo);
	}

	@Override
	public long sCountByLikeName(String likeName) {
		return sdi.sCountByLikeName(likeName);
	}

	@Override
	public List<Student> sByLikeName(String likeName, int start, int size) {
		return sdi.sByLikeName(likeName, start, size);
	}

}
