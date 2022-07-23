package week2.day1;

public class MyPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a object
		// classname obj_name = new classname();
		OnePlus myPhone = new OnePlus();
		
		//call a method 
		String phoneColor = myPhone.getPhoneColor(); 
		System.out.println(phoneColor);
		
		long phoneNumber = myPhone.getPhoneNumber();
		System.out.println(phoneNumber);
		
		myPhone.switchoff();
	}

}
