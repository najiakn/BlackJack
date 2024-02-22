import java.util.ArrayList;
import java.util.List;

public class Main {
    private int valeurTotale;
    private String nomCarte;
    private int nbCartes;
    private int listCartes;
    private List<Carte> cartes;

    public int getValeurTotale(){
        return valeurTotale;
    }

    public void setValeurTotale(int nvValeurTotale){
       nvValeurTotale= valeurTotale;
    }

    public String getNomCarte(){
        return nomCarte;
    }

    public void setNomCarte(String nvNomCarte){
        nvNomCarte=nomCarte;
    }
    public void setNbCartes(int nvNbCartes){
        nvNbCartes=nbCartes;
    }

    public int getNbCartes(){
        return nbCartes;
    }
    public int getListCartes(){
        return listCartes;
    }

    public void  setListCartes(int nvListCartes){
        nvListCartes=listCartes;
    }
    
       
    
        public Main(){
          this.cartes = new ArrayList<>();
          this.nbCartes=0;
        }
        public List<Carte> getCartes() {
            return cartes;
        }

        public void ajouterCarte(Carte carte){
            cartes.add(carte);
            this.nbCartes++;
        }

        public int calculerValeurMain(){
            int nombreAs=0;
            valeurTotale = 0;
            for (Carte carte : cartes){
                valeurTotale+=carte.getValeur().getValeur();
                if (carte.getValeur()== Valeur.Ace){
                  nombreAs ++;
                }
            }

            while (valeurTotale > 21 && nombreAs > 0 ){
                valeurTotale-=10;
                 nombreAs--;
            }

            return valeurTotale;
        }

       

      

       
        
        
}
