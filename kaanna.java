public class kaannaTeksti{
  public static void main(String[] args){
    System.out.println(kaanna("merkkijono", 3, 7));
  }

public static String kaanna(String s, int alku, int loppu){
  String reverse = "";
  String uusi = s.substring(alku, loppu);
  String uusiAlku = s.substring(0,alku);
  String uusiLoppu = "";
  
  for(int i=uusi.length()-1; i>=0; i--){
    reverse = reverse + uusi.charAt(i);
  }
  for(int y=uusi.length()-1; y>=loppu; y--){
    uusiLoppu = uusiLoppu + s.charAt(y);
    System.out.println(uusiLoppu);
    return uusiLoppu;
  }
  String kokonainen = uusiAlku + reverse;
  kokonainen = kokonainen + uusiLoppu;
  
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
