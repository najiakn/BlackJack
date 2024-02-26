
public class Carte implements CarteInterface {

   
   private Valeur valeur;
   private Couleur couleur;

   public Carte(Valeur  valeur,Couleur couleur){
    
      this.valeur=valeur;
      this.couleur=couleur;
    
  
     }
     @Override
   public void setCouleur(Couleur couleur){
    this.couleur= couleur;
   }
    @Override
   public Couleur getCouleur(){
    return couleur;
   }
   @Override
   public void setValeur(Valeur valeur){

    this.valeur=valeur;

   }
   @Override
   public Valeur getValeur(){
    return valeur;
   }

   

   @Override
        public String toString(){
           return "["+this.valeur.getNom()+"|"+this.couleur.getNom()+"] ==> "+this.valeur.getValeur();
        }
   

   
}
