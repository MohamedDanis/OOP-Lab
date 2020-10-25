package ooplab;

public class Palindrome1 {
	public static void main(String args[]) {
		System.out.println("Name : Mohamed Danis AP");
		System.out.println("Class : S3CS1  Rollno : 39");
		String a="radar";
		String rev="";
		int j=a.length();
		for(int i=j-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		if(a.equals(rev)) {
			System.out.println("The given string is Palindrome");
		}
		else {
			System.out.println("The string is not Palindrome");
		}
	}
}
