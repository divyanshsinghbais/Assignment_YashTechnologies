package com.yash.springjdbc;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.yash.springjdbc.dao.StudentDao;
import com.yash.springjdbc.entities.Student;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/springjdbc/applicationcontext.xml");
		StudentDao stdao = context.getBean("StudentDao",StudentDao.class);
		Student s = new Student(); 
		
		/*
		 * All students list
		 */
		List<Student> stu=stdao.getAllDetails();
		for(Student s1:stu)
		{
			System.out.println(s1);
		}
		
		/*
		 * insert the details
		 */
//		s.setId(104);
//		s.setName("Shubham Yadav");
//		s.setAge(26);
//		s.setAddress("Airport road");	
//		int r=stdao.insert(s);
//		System.out.println(r + "Student added Successfully ");		

		/*
		 * update the details
		 */
		//int r=stdao.updatedetails(s);		
		//System.out.println(r + "Student details updated ");
		
		//int r=stdao.deletedetails(103);//delete the details
		//Student s=stdao.selectDetails(108);
		//System.out.println(s);
		

	}
}
