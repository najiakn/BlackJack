public interface MainInterface {

    public int getValeurTotale();
    public void setValeurTotale(int nvValeurTotale);
    public String getNomCarte();
    public void setNomCarte(String nvNomCarte);
    public void setNbCartes(int nvNbCartes);
    public int getNbCartes();
    public int getListCartes();
    public void  setListCartes(int nvListCartes);
    public void ajouterCarte(Carte carte);
    public int calculerValeurMain();
}