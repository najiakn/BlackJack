import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaquetCartes implements PaquetCartesInterface {
 private List<Carte> cartes;
        private int size;
    
            public PaquetCartes(){
                this.cartes = new ArrayList<>();
                this.size=0;
            }
        @Override
        public void remplirPaquetCartes(){
           for (Couleur cl : Couleur.values()){
               for(Valeur valeur : Valeur.values()){
                   Carte carte = new Carte (valeur,cl);
                   cartes.add(carte);
                   this.size++;
               }
           }
               melanger();
        }
@Override
        public void melanger(){
            Collections.shuffle(cartes);
        }
@Override
        public int getSize() {
            return size;
        }
        @Override
        public Carte tirerCarte(){
             if (cartes.isEmpty()){
               System.out.println("le paquet est vide ");
               return null;
             }
             
               Carte carteTire = cartes.remove(0);
               this.size--;
               return carteTire;
                 
        }


        
        
}
