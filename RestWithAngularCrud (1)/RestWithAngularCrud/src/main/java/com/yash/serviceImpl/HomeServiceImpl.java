package com.yash.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.StudentForm;
import com.yash.repository.HomeRepository;
import com.yash.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;

	@Override
	public void SaveData(StudentForm sf) {
	// TODO Auto-generated method stub
	hr.save(sf);	
	}

	@Override
	public List<StudentForm> GetAllStudentForm() {
	// TODO Auto-generated method stub
	return hr.findAll();
	}
	
	@Override
	public void deleteData(int sid) {
		// TODO Auto-generated method stub
		hr.deleteById(sid);
	}

	@Override
	public StudentForm updateData(StudentForm sf) {
		// TODO Auto-generated method stub
		StudentForm student = new StudentForm();
		try {
			student = getStudent(sf.getSid());
			
			if(student!=null) {
				student.setSid(sf.getSid());
				student.setSname(sf.getSname());
				student.setAddress(sf.getAddress());
				student.setMobno(sf.getMobno());
				student.setEmail(sf.getEmail());
				hr.save(student);
			}
		}
		catch (Exception e) {
			System.out.println("Exception while modifing student");
		}
		return null;
	}
	
	@Override
	public StudentForm getStudent(int sid) {
//Employee employee = empService.getEmployee(empId);
		StudentForm emp = new StudentForm();
		try {
			emp = convertToStudent(hr.findById(sid));
		} catch (Exception e) {
			System.out.println("exception while getting employee");
		}
		return emp;
	}

	private StudentForm convertToStudent(Optional<StudentForm> emp) {
		StudentForm student = new StudentForm();
		if (emp != null) {
			student.setSid(emp.get().getSid());
			student.setSname(emp.get().getSname());
		}
		return student;
	}

	
}
