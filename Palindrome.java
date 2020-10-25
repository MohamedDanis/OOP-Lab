package ooplab;

public class Palindrome {
	public static void main(String args[]) {
		String a="radar";
		int i=0,j=a.length()-1;
		while(i<j) {
			if(a.charAt(i)!=a.charAt(j)){
				System.out.println("The given string is not Palindrome"); 
			}
			i++;
			j--;
		}
		System.out.println("The given string is Palindrome");
	}
}
 