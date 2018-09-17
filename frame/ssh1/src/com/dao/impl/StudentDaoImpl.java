package com.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dao.StudentDao;
import com.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private HibernateTemplate ht;
	@Override
	public List<Student> selectStudents() {
		return ht.getSessionFactory().getCurrentSession().createQuery("from Student").list();
	}

	@Override
	public void insertByStudent(Student student) {
		ht.save(student);
	}

	@Override
	public void updateByStudent(Student student) {
		ht.update(student);
	}

	@Override
	public void delete(int stuNo) {
		Student student = new Student();
		student.setStuNo(stuNo);
		ht.delete(student);
	}

	@Override
	public Student selectStudent(Integer stuNo) {System.out.println(stuNo);
		return ht.load(Student.class, stuNo);
	}

	@Override
	public long sCountByLikeName(String likeName) {
		return (long)ht.getSessionFactory().getCurrentSession()
				.createQuery("select count(1) from Student where name like ?")
				.setParameter(0, "%"+likeName+"%")
				.uniqueResult();
	}

	@Override
	public List<Student> sByLikeName(String likeName,int start,int size) {
		return (List<Student>)ht.getSessionFactory().getCurrentSession()
				.createQuery("from Student where name like ?")
				.setParameter(0, "%"+likeName+"%")
				.setFirstResult(start)
				.setMaxResults(size)
				.list();
	}

}
