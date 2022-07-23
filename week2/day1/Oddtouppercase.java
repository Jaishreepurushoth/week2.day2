package week2.day1;

public class Oddtouppercase {

	
	public static String oddtoUpper(String s) {
		String str2="";
		char arr[] = s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char c=arr[i];
			if(i%2!=0) {
				c=Character.toUpperCase(c);
			}
			str2 =str2+c;
		}
		return str2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="changeme";
		System.out.println("the given string is: " +str);
		System.out.println("the odd index to uppercase: "+oddtoUpper(str));
	
	}

}
