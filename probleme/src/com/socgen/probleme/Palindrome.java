package com.socgen.probleme;

public class Palindrome {

	public static void main(String[] args) {
		String motALendroit = "AAIAA";
		String motALenver = reverse(motALendroit); 
		if (isPalindrome(motALenver, motALendroit)) {
			System.out.println("c'est un palindrome!");}
			else {
				System.out.println("ce n'est pas un palindrome");
			}
		}

	
	public static String reverse(String chaine) {
		
		char[] tab = chaine.toCharArray();
		char[] tabALenver = new char [tab.length];
		
		for (int i = tab.length-1, j = 0; i>= 0; i--, j++) {
			tabALenver [j] = tab [i];
			}
		
		String reversee = "";
		for (char c: tabALenver) {
			reversee += c + "";
		}
		
		return reversee;
		
	
	}
	
	public static boolean isPalindrome(String chaineALenver, String chainALendroit) {
		if (chaineALenver.equals(chainALendroit))
		return true;
		else 
			return false;
		
				
	}
}
