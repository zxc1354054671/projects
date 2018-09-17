package com.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.Student;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.StudentService;

public class StudentAction extends ActionSupport implements ModelDriven<Student>{
	@Autowired
	private StudentService ssi;
	private Student student= new Student();
	private List<Student> students;
	private String action;
	
	private Integer pageNo;
	private Long pageCount;
	private String likeName;
	
	public String toIndex() {
		if(pageNo==null || "".equals(pageNo)) pageNo=1;
		int size=3;
		long totalCount = ssi.sCountByLikeName(likeName);
		System.out.println(11);System.out.println(totalCount);
		if(likeName==null) likeName="";
		if(totalCount>0){
			pageCount=totalCount%size==0?(totalCount/size):(totalCount/size+1);
			int start=(pageNo-1)*size;
			students = ssi.sByLikeName(likeName, start, size);
		}
		return "index";
	}
	
	public String delete() {
		ssi.delete(student.getStuNo());
		return SUCCESS;
	}
	
	public String toInsert() {
		this.action="insert";
		return "alter";
	}
	public String toUpdate() {
		this.action="update";
		System.out.println(student);
		System.out.println(student.getStuNo());
		student=ssi.selectStudent(student.getStuNo());
		System.out.println(student);
		return "alter";
	}
	
	public String doInsert() {
		if(student!=null){
			ssi.insertByStudent(student);
		}
		return "toIndex";
	}
	
	
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageCount() {
		return pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public String getLikeName() {
		return likeName;
	}

	public void setLikeName(String likeName) {
		this.likeName = likeName;
	}

	@Override
	public Student getModel() {
		return student;
	}
}
