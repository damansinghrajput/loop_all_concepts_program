package test.com;

public class IsPrime {
	
	private int number;

	IsPrime(int number){
		
		this.number=number;
	
	}
	
	boolean isPrime(){
		
	
	for(int i = 2; i<number-1;i++) 
		
		if(number%i==0) {
			return false;
		}
		return true;
	
	
	}


	int sumUpToN() {
		int sum = 0;
		for(int i=1; i<=number; i++)
		sum = sum + i;
		return sum;
		
		
	}
	 void printtriangle() {
		for(int i=1 ; i<=number; i++) {
			
			for(int j=1 ; j<=i; j++) {
				
				 System.out.print(j +" ");
	
	 }
		System.out.println();
		 
	 }
		
	 
	 }	 

	 
	public static void main(String[] args) {
		
		
		
		IsPrime prime = new IsPrime(3);
		boolean isPrime = prime.isPrime();
		System.out.println("isPrime "+isPrime);
		
		int sum = prime.sumUpToN();
		System.out.println("sum "+sum);
		
		prime.printtriangle();
		 
		}

	
  
		
		
		

}
