package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Connection Started..." );
        
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        
//        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//        
//       Student student=new Student();
//       student.setId(12);
//       student.setName("Shubhman");
//       student.setCity("Punjab");
//       
//       int result=studentDao.insert(student);
//       System.out.println("Student Added"+result);
//       student.setId(22);
     

//       
//       int result=studentDao.change(student);
//       System.out.println(result+" "+"Student Updated Succesfully!");
       
//       int result=studentDao.delete(student);
//       System.out.println(result+" "+"Student Deleted!");
       
//       Student student=studentDao.getStudent(12);
        
        List<Student> students=studentDao.getAllStudents();
        for(Student s:students) {
        	
        	System.out.println(s);
        }
       
       
       
        
    }
}
