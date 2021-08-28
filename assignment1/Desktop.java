package week3.day2.assignment1;

import javaprogram.LearnAbstract;

public class Desktop extends LearnAbstract implements HardWare,Software{
	public void hardwareResources()
	{
		System.out.println("Printer");
		System.out.println("Memory");
		System.out.println("Disk");
		System.out.println("CPU");
        System.out.println("Screen network windows system");
	}

	public void softwareResources()
	{
		System.out.println("Adobe Photoshop");
		System.out.println("Picasa");
		System.out.println("VLC Media Player");
		System.out.println("Windows Media Player");
        System.out.println("Windows Movie Maker");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract class.It is inherited by desktop class");
	}


}
