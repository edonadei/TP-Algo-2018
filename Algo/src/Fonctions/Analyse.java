package Fonctions;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.Spring;

public class Analyse {
	
	
	public int addition(int a,int b) {
		return a+b;
	}
	public int soustraction(int a,int b) {
		return a-b;
	}
	public int multiplication(int a,int b) {
		return a*b;
	}
	public int division(int a,int b) {
		return a/b;
	}
	
	public static int initialisation() {
		String calcultxt = entreecalcul();
		StringtoArrayList(calcultxt);
		return 0;
	}
	
	public static ArrayList StringtoArrayList(String texte) {
		ArrayList<Character> chars = new ArrayList<Character>();
		for(char c : texte.toCharArray()) {
			chars.add(c);
		}
		return chars;
		
	}
	
	
	
	public static String entreecalcul() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(initialisation());
	}

}
