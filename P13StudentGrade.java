class P13StudentGrade{
	public static void main(String args[])
	{
		int sub1,sub2,sub3,sub4,sub5,total=0;
		double per;
		sub1=Integer.parseInt(args[0]);
		sub2=Integer.parseInt(args[1]);
		sub3=Integer.parseInt(args[2]);
		sub4=Integer.parseInt(args[3]);
		sub5=Integer.parseInt(args[4]);
		
		total=sub1+sub2+sub3+sub4+sub5;
		per=total/5;
		
		System.out.println("\n Total Marks= "+total);
		System.out.println("\n Student Percentage= "+per+"%");
		
		if(per>=35 && per<55)
		{
			System.out.println("\n The student has a D grade.");
		}
		else if(per>=55 && per<65)
		{
			System.out.println("\n The student has a C grade.");
		}
		else if(per>=65 && per<75)
		{
			System.out.println("\n The student has a B grade.");
		}
		else if(per>=75 && per<85)
		{
			System.out.println("\n The student has a A grade.");
		}
		else if(per>=85 && per<=100)
		{
			System.out.println("\n The student has a A+ grade.");
		}
		else
		{
			System.out.println("\nThe student has failed");
		}
	}
}