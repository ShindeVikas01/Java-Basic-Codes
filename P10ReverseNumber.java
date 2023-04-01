class P10ReverseNumber{
	public static void main(String args[])
	{
		int num,rnum,reverse=0;
		num=Integer.parseInt(args[0]);
		while(num>0)
		{
			rnum=num%10;
			reverse=reverse*10+rnum; 
			num=num/10;
		}
		System.out.println("Reverse number is = "+reverse);	
	}
}