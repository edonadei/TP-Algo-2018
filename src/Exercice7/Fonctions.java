package Exercice7;

public class Fonctions {
	
	Fonctions ()
	{

	}
	
	
	double factorielle(int x)  // x! = valeur
	{
		double valeur = 1;    //valeur initial de x! pour 0!
		for(int i=1;i<=x;i++) {      // addition de 1*2*3*4*.....*x
			valeur = valeur * i;	
		}
		return valeur;  
		
	}
	
	public static void main(String[] args) {
		System.out.println(factorielle(5));
		
	}

}
