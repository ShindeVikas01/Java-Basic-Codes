class P3BigNum{
	public static void main(String args[])
	{
		int num1,num2;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		if(num1>num2)
		{
			System.out.println("Num1 is big");
		}
		else if(num1=num2)
		{
			System.out.println("Num1 and num2 are equal");
		}
		else{
			System.out.println("Num2 is big");
		}
	}
}