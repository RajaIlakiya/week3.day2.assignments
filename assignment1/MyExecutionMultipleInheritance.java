package week3.day2.assignment1;

public class MyExecutionMultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Desktop desk=new Desktop();
desk.display();
System.out.println("*************Hardware implemented by desktop*************");
desk.hardwareResources();
System.out.println("*************Software implemented by desktop*************");
desk.softwareResources();
	}

}
