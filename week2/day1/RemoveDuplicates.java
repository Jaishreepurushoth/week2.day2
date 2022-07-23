package week2.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text= "We learn java basics as part of java sessions in java week1";
		String result="";
		String split[]=text.split(" ");
		System.out.println(text);
		for(int i=0;i<split.length;i++) {
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j])) {
					split[j]="";
				}				
			}
		}
		for(int i=0;i<split.length;i++) {
			if(split[i]!="") {
			result=result+split[i]+" ";	
		}}
		System.out.print(result);

	}

}
