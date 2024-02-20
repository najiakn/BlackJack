public class Croupier  extends personne{

    private int  valeurTotalLimit;

    public int getValeurTotalLimit(){
             return valeurTotalLimit;
    }
    public void setValeurTotalLimit(int nValeurTotalLimit){
        nValeurTotalLimit=valeurTotalLimit;
    }

    public Croupier(int main, int nValeurTotalLimit){
        super(main);
        nValeurTotalLimit=valeurTotalLimit;
    }
    
}
