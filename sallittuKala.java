import java.util.Random;
public class sallittuKala{
public static void main(String[] args){
final Random rnd = new Random();
                
        for (int i=0; i<10; i++){
            Kala kala = new Kala(rnd.nextInt(90), rnd.nextInt(7) + rnd.nextDouble());
            System.out.println("" + kala);
            System.out.println(kala.sallittu() ? "Sallittu" : "Ei sallittu");
            // Herjaa, ettei lˆyt‰ argumentteja ylle. Listan pituus ei m‰ts‰‰.
        }        
  }
}
class KalaMitat{
    public static final int MINIMIPITUUS = 25;
    public static final int MAKSIMIPITUUS = 75;
    public static final double MINIMIPAINO = 1.0;
    public static final double MAKSIMIPAINO = 5.0;
}
class Kala{
    private int pituus;
    private double paino;
    
    public Kala(int pituus, double paino){
        this.pituus = pituus;
        this.paino = paino;
    }
    
// Start
    public boolean sallittu(int pituus, double paino){
      if(KalaMitat.MINIMIPITUUS < pituus && KalaMitat.MINIMIPAINO < paino
        && KalaMitat.MAKSIMIPITUUS > pituus && KalaMitat.MAKSIMIPAINO > paino){
        return true;
      }
    } 

/* Olipa kerran kalastuskilpailu. Luokassa KalaMitat on m‰‰ritelty 
 * kilpailussa sallittujen kalojen minimi- ja maksimipituus ja -paino 
 * luokkamuuttujina. Luokka Kala mallintaa yht‰ kalaa.

Kirjoita luokkaan Kala julkinen metodi boolean sallittu(), 
joka palauttaa arvon true tai false sen mukaan, onko kyseinen Kala-olio 
kilpailuissa sallituissa rajoissa.
*/
        public String toString(){
        return "Pituus:" + pituus + ", paino:" + paino;
    }
}