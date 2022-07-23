package week2.day1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2 , n=22;
		boolean flag = true;
		
		for (i = 2; i < n; i++) {
			
			if (n%i == 0) {
				
				System.out.println("It is not a prime ");
				flag = false;
				break;
				
			}
			
			
		}
		if (flag== true) {
			
			System.out.println("It is a prime ");
		}
		
	}

}
