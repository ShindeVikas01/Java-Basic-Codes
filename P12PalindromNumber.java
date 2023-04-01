class P12PalindromNumber{
	public static void main(String args[])
	{
		int number,mod,sum=0,temp;       
		number=Integer.parseInt(args[0]);
		temp=number;

		//Calculation for finding Palindrome number
		while(number>0)    
		{    
			mod=number%10;    
			sum=sum*10+mod;    
			number=number/10;    
		}    
		if(temp==sum)   
		{
			System.out.println("Palindrome  number "); 
		} 
		else 
		{
			System.out.println("Not Palindrome number");  
		}   
	}
}
