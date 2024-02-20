
public enum Couleur {
  Carreau("carreau"), 
  Cœur("Cœur"),
  Pique("pique"), 
  Trèfle("trèfle");

 private  final String  nom;


 private Couleur(String nom){
    this.nom=nom;
 } 
 public String getNom(){
    return nom;
 }
 
    
}
