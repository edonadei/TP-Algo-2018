package Fonctions;

public class Utilitaire {
	
	void Fonctions ()
	{

	}
	
	
	static double factorielle(int x)  // x! = valeur
	{
		double valeur = 1;    //valeur initial de x! pour 0!
		for(int i=1;i<=x;i++) {      // addition de 1*2*3*4*.....*x
			valeur = valeur * i;	
		}
		return valeur;  
		
	}
	
	static double puissance(int nombre,int lapuissance) {
		double valeur = 1;
		for(int i = 0;i<lapuissance;i++) {
			valeur = valeur * nombre;
		}
		return valeur;
	}
	
	
	
	static double exponentiel(int a) {
		double valeur = 0;
		for(int i=0;i<=a;i++) {
			valeur = valeur + puissance(a,i)/factorielle(i);
		}
		return valeur;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(exponentiel(110));
		
	}

}
