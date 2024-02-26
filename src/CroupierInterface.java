public interface CroupierInterface {

    public void distribuerCartes(Joueur joueur, PaquetCartes paquet);
    public void releverCarteCashe();
    public void  tirerCarte(PaquetCartes paquet);
    public void  comparerMains(Joueur joueur);
    public void voirCartes() ;
}