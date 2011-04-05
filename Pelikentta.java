//import java.util.*;
//import fi.jyu.mit.ohj2.Syotto;


/*sisaltaa pelikentan
arpoo uuden int x int pelikentan, siten etta morrimoykky ja kuoppa eri ruuduissa
osaa kertoa kysytyn ruudun ominaisuuden
Avustajat: taulukko
*/


public class Pelikentta {
	
	final int TYHJA = 0;
	final int MORRI = 1;
	final int KUOPPA = 2;

	
	private int[][] kentta;

	
	Pelikentta(int koko) {
		int[][] kentta = new int[koko][koko];
		for (int rivi=0; rivi<kentta.length; ++rivi)   // alustaa kentan nollilla
		      for (int sarake=0; sarake<kentta[rivi].length; ++sarake) 
		    	  kentta[rivi][sarake] = 0;
		kentta[0][2] = MORRI;
		kentta[2][2] = KUOPPA;
		        

		System.out.println("pelikentan koko on: "+koko+"x"+koko);
		System.out.println(kentta[2][2]);

	}
	
	int get_ruutuInfo(int x,int y) {
		System.out.println(kentta[0][0]);
		//if (kentta[2][2] == MORRI)
		//	return MORRI;
		//else if (kentta[2][2] == KUOPPA)
		//	return KUOPPA;
		return 0;
	}
	
	void arpoo(){
		eivalmis();
	}
	
	void eivalmis(){
		System.out.printf("ei viela toteuttu");
	}
	

	public static void main(String[] args) {
		System.out.println("Pelikentta kokeilu");
		Pelikentta ekapeli = new Pelikentta(4);
		System.out.println("osuko? "+ ekapeli.get_ruutuInfo(2,2));
		
	}

}
