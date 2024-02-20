
public enum  Valeur {
    Valet("Valet",10),
    Dame("Dame",10),
    Roi("Roi",10),
    Ace("Ace",11),
    Deux("Deux",2),
    Trois("Trois",3),
    Quatre("Quatre",4),
    Cinq("Cinq",5),
    Six("Six",6),
    sept("sept",7),
    huit("huit",8),
    neuf("neuf",9),
    dix("dix",10);
    
    private final String nom;
    private final int valeur;
    private Valeur(String nom,int valeur){
        this.nom=nom;
        this.valeur=valeur;
    }
    public String getNom(){
        return nom;
    }
    public int getValeur(){
        return valeur;
    }
}
