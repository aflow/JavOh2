// package JavOh2; 

import fi.jyu.mit.ohj2.*;

/**
 * Mörrimöykkypelin Matkustaja-luokka
 * Käsittelee pelikentällä liikkumisen,
 * sekä selvittää ruutujen ominaisuudet.
 *
 * @author  Antti Vuorenmaa
 * @version 5.4.2011 
 *
 */
public class Matkustaja {

    private static int xco;
    private static int yco;

     /**
     * Liikkuu pelikentällä askeleen annettuun suuntaan
     * muuttamalla halutun kordinaatin tilaa
     * @param s Suunta johon liikutaan
     */

    static void liiku(int x, int y, char s) {
    
    if ( s == 'P' ) { yco = y+1; }
    else if ( s == 'E' ) { yco = y-1; }
    else if ( s == 'L' ) { xco = x-1; }
    else if ( s == 'I' ) { xco = x+1; }
    }


     /**
     * Tarkistaa ruudun ominaisuuden Pelikentta-oliolta
     * @param 
     */

    static void tarkista(int x, int y) {
    System.out.println("Ruudussa tuulee! Kuoppa on lähellä.");
    }


     /**
     * Pääohjelma, joka testaa luokkaa.
     * @param args
     */
    public static void main(String[] args) {
    liiku(0,0,'P');
    tarkista(xco,yco);
    System.out.println(xco + " " + yco);
     }




}

