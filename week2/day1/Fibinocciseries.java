package week2.day1;

public class Fibinocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,1,1,2,3,5,8,13,21,34,55 ||
		
		// create 3 variables firstNum , secondNum , sum
		// loop thro from 0 to 11 
		// sum the last 2 values and swap the values
		//print the series sum 
		
		int firstNum=0 , secNum=1 , sum=0;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 0; i < 11 ; i++) {
			
			sum = firstNum +secNum ;
			firstNum = secNum ;
					secNum =sum ;
					//System.out.println(firstNum);
					//System.out.println(secNum);
					System.out.println(sum);
		}
	
	}

}
