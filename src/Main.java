import java.util.ArrayList;
import java.util.List;

public class Main implements  MainInterface {
    private int valeurTotale;
    private String nomCarte;
    private int nbCartes;
    private int listCartes;
    private List<Carte> cartes;
@Override
    public int getValeurTotale(){
        return valeurTotale;
    }
@Override
    public void setValeurTotale(int nvValeurTotale){
       nvValeurTotale= valeurTotale;
    }
@Override
    public String getNomCarte(){
        return nomCarte;
    }
@Override
    public void setNomCarte(String nvNomCarte){
        nvNomCarte=nomCarte;
    }
    @Override
    public void setNbCartes(int nvNbCartes){
        nvNbCartes=nbCartes;
    }
@Override
    public int getNbCartes(){
        return nbCartes;
    }
    @Override
    public int getListCartes(){
        return listCartes;
    }
    @Override

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
@Override
        public void ajouterCarte(Carte carte){
            cartes.add(carte);
            this.nbCartes++;
        }

@Override
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
