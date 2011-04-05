/* package morrimoykky; */
import fi.jyu.mit.ohj2.*;

/**
 * Mörrimöykkypelin käyttöliittymä 
 * 
 * @author  Antti Vuorenmaa
 * @version 5.4.2011 
 *
 */
public class Kayttoliittyma {


private static String kelpaavat = "APILEQ";
private static String introteksti = "*Mörrimöykkypeli*";
private static String liikkumisteksti = "Ammutko (A) vai liikutko pohjoiseen (P), itään (I), länteen (L) tai etelään (E)? (Q) :";
private static String ei_osumaa = "Ei osunut!";
private static String osuma = "Osui, mörrimöykky is DEAD! Voitit pelin";
private static String gameover = "GAME OVER!";
private static boolean quit = false;

     /**
     * Pääohjelma, jossa taika tapahtuu.
     * @param args
     */
    public static void main(String[] args) {
    
        System.out.println(introteksti);
        
        while (quit == false) {

            System.out.print(liikkumisteksti);
            char c = IO.odota_nappain(kelpaavat,'Q',IO.MERKKI_ISOKSI);
            if (c == 'Q') { quit = true; System.out.println("Kiitos pelaamisesta!"); }
            if ("APILE".indexOf(c) >= 0 ) {
            System.out.println("Nyt niitä juttuja tapahtuu!");             
            }
        }
     }




}

