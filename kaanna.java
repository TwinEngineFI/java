public class kaanna{
  public static void main(String[] args){
    System.out.println(kaanna("merkkijono", 3, 7));
}

public static String kaanna(String s, int alku, int loppu){
  String reverse = "";
  String uusi = s.substring(alku, loppu);
  for(int i=uusi.length()-1; i>=0; i--){
    reverse = reverse + uusi.charAt(i);
  }
  return reverse;
  }
}

/*
  Kirjoita metodi kaanna(String s, int alku, int loppu), joka k‰‰nt‰‰ 
  parametrimerkkijonon merkit p‰invaistaiseen j‰rjestykseen v‰lilt‰ 
  [alku, loppu) ja palauttaa muutetun merkkijonon kutsujalle.
  Esimerkki:
  System.out.println(kaanna("merkkijono", 3, 7)); // Tulostaa merkkijono 
  */