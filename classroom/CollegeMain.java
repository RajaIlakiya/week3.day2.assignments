package week3.day2.classroom;

public class CollegeMain extends University {

	@Override
	void ug() {
		// TODO Auto-generated method stub
		System.out.println("UG courses available in my college");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeMain obj=new CollegeMain();
		obj.ug();
		obj.pg();
	}


}
