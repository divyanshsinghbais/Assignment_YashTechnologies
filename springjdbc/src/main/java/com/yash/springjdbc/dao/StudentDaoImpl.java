package com.yash.springjdbc.dao;
import com.yash.springjdbc.entities.*;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbctemp;
	
	
	public int insert(Student stu) {
		
		String q="insert into student(id,name,age,address) values(?,?,?,?)";
    	int msg=this.jdbctemp.update(q,stu.getId(),stu.getName(),stu.getAge(),stu.getAddress());
		return msg;
	}
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	public int updatedetails(Student stu) {
		// update details of student
		String q="update student set name=? where id=?";
		int msg=this.jdbctemp.update(q,stu.getName(),stu.getId(),stu.getAge(),stu.getAddress());
		
		return msg;
	}

	public int deletedetails(int stuid) {
		// TODO Auto-generated method stub
		String q="delete from student where id=?";
		int msg=this.jdbctemp.update(q,stuid);
		
		return msg;
		
	}
	
	public Student selectDetails(int stuid) {
		// TODO Auto-generated method stub
		String q="select * from student where id=?";
		RowMapper<Student> rowmapper=new RowMapperimpl();
		Student student=this.jdbctemp.queryForObject(q,rowmapper,stuid);
		
		return student;
		
	}
	
	public List<Student> getAllDetails() {
		// TODO Auto-generated method stub
		String q="select * from student";
		List<Student> stu=this.jdbctemp.query(q,new RowMapperimpl());
		return stu;
		
	}

}
