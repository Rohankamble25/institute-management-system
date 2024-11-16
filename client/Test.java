package cjc.ims.app.client;
import java.util.*;
import com.cjc.ims.app.serviceimpl.Karvenagar;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Karvenagar k = new Karvenagar();
		int choice;
		
		do {
			
			System.out.println("********MENU*********\n1.Course \n2.Faculty\n3.Batch \n4.Student");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch (choice)
			{
			case 1:
			{
				k.addCourse();
				k.viewCourse();
				break;
			}
			case 2:
			{
				k.addFaculty();
				k.viewFaculty();
				break;
			}
			case 3:
			{
				k.addBatch();
				k.viewBatch();
				break;
			}
			case 4:
			{
				k.addStudent();
				k.viewStudent();
				break;
			}
			default:
				System.out.println("You entered a wrong choice");
				
			
				
			}	
			}while(choice!=5);
	}
}
