class P11ArmstrongNumber{
	public static void main(String args[])
	{
		int number,mod,sum=0,temp;
		number=Integer.parseInt(args[0]);
		temp=number;    

		//Calculation for finding armstron number
		while(number>0)    
		{    
			mod=number%10;    
			sum=sum+(mod*mod*mod);    
			number=number/10;    
		}    
		if(temp==sum)   
		{
			System.out.println("Armstrong  number "); 
		} 
		else 
		{
			System.out.println("Not Armstrong number");  
		}   
	}
}