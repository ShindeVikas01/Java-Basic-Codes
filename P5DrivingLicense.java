class P5DrivingLicense{
	public static void main(String args[])
	{
		int age;
		age=Integer.parseInt(args[0]);
		if(age>18)
		{
			System.out.println("Client is valid for driving");
		}
		else
		{
			System.out.println("Client is not valid for driving");
		}
	}
}