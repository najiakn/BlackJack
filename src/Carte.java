

public class Carte {

   
   private Valeur valeur;
   private Couleur couleur;

   public Carte(Valeur  valeur,Couleur couleur){
    
      this.valeur=valeur;
      this.couleur=couleur;
    
  
     }
   public void setCouleur(Couleur couleur){
    this.couleur= couleur;
   }
    
   public Couleur getCouleur(){
    return couleur;
   }
   public void setValeur(Valeur valeur){

    this.valeur=valeur;

   }
   public Valeur getValeur(){
    return valeur;
   }

   

   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return couleur.getNom()+valeur.getNom();
   }
   

   
}
