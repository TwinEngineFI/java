public class kaannaTeksti{
  public static void main(String[] args){
    System.out.println(kaanna("merkkijono", 3, 7));
  }

public static String kaanna(String s, int alku, int loppu){
  String reverse = "";
  String uusi = s.substring(alku, loppu);
  String uusiAlku = s.substring(0,alku);
  String uusiLoppu = s.substring(loppu);
  
  for(int i=uusi.length()-1; i>=0; i--){
    reverse = reverse + uusi.charAt(i);
  }

  String kokonainen = uusiAlku + reverse + uusiLoppu;
  return kokonainen;
  }
}

/*
  Kirjoita metodi kaanna(String s, int alku, int loppu), joka kääntää 
  parametrimerkkijonon merkit päinvaistaiseen järjestykseen väliltä 
  [alku, loppu) ja palauttaa muutetun merkkijonon kutsujalle.
  Esimerkki:
  System.out.println(kaanna("merkkijono", 3, 7)); // Tulostaa merjikkono  
  */
