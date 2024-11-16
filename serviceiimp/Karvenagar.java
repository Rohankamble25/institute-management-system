package com.cjc.ims.app.serviceimpl;
import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;
import java.util.*;

public class Karvenagar implements Cjc {
	List<Course> clist = new ArrayList<>();
	 List<Faculty> flist=new ArrayList<>(); 
	 List<Batch> blist=new ArrayList<>(); 
	 List<Student> slist=new ArrayList<>();
	 
	@Override
	public void addCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the course id");
		int id=sc.nextInt();
		System.out.println("Enter the course name");
		String name=sc.next();
		
		Course c = new Course();
		c.setCid(id);
		c.setCname(name);
		
		clist.add(c);	
	}
	
	@Override
	public void viewCourse() {
		for(Course c : clist)
		{
			System.out.println("Course ID: "+c.getCid());
			System.out.println("Course Name: "+c.getCname());	
		}	
	}
	
	@Override
	public void addFaculty() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Faculty id");
		int id=sc.nextInt();
		System.out.println("Enter the Faculty name");
		String name=sc.next();
		
		Faculty f = new Faculty();
		f.setFid(id);
		f.setFname(name);
		
		Course co = clist.get(0);
		f.setCourse(co);
		
		flist.add(f);
	}
	
	@Override
	public void viewFaculty() {
		for(Faculty f : flist)
		{
			System.out.println("Faculty ID: "+f.getFid());
			System.out.println("Faculty Name: "+f.getFname());
			System.out.println("Faculty's Course ID: "+f.getCourse().getCid());
			System.out.println("Faculty's Course Name: "+f.getCourse().getCname());
		}
	}
	
	@Override
	public void addBatch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Batch id");
		int id=sc.nextInt();
		System.out.println("Enter the Batch name");
		String name=sc.next();
		
		Faculty fo = flist.get(0);
		
		Batch b = new Batch();
		b.setBid(id);
		b.setBname(name);
		b.setFaculty(fo);
		
		blist.add(b);
	}
	
	@Override
	public void viewBatch() {
		System.out.println("Batch Details");
		
		for(Batch b : blist)
		{
			System.out.println("Batch ID: "+b.getBid());
			System.out.println("Batch Name: "+b.getBname());
			System.out.println("Batch Faculty ID: "+b.getFaculty().getFid());
			System.out.println("Batch Faculty Name: "+b.getFaculty().getFname());
			System.out.println("Batch Course ID: "+b.getFaculty().getCourse().getCid());
			System.out.println("Batch Course Name: "+b.getFaculty().getCourse().getCname());
		}
	}
		
	
	@Override
	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student id");
		int id=sc.nextInt();
		System.out.println("Enter the Student name");
		String name=sc.next();
		
		Batch bo = blist.get(0);
		
		Student stu = new Student();
		stu.setSid(id);
		stu.setSname(name);
		stu.setBatch(bo);
		
		slist.add(stu);
	}
	
	@Override
	public void viewStudent() {
		System.out.println("Student Details");
		
		for(Student s : slist)
		{
			System.out.println("Student ID: "+s.getSid());
			System.out.println("Student Name: "+s.getSname());
			System.out.println("Student Batch ID: "+s.getBatch().getBid());
			System.out.println("Student Batch Name: "+s.getBatch().getBname());
			System.out.println("Student Faculty ID: "+s.getBatch().getFaculty().getFid());
			System.out.println("Student Faculty Name: "+s.getBatch().getFaculty().getFname());
			System.out.println("Student Course ID: "+s.getBatch().getFaculty().getCourse().getCid());
			System.out.println("Student Course Name: "+s.getBatch().getFaculty().getCourse().getCname());	
		} 
	}
}

