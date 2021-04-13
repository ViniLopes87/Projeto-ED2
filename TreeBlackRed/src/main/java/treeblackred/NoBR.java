package treeblackred;

public class NoBR extends No {

    public char cor;
 
    public NoBR(int chave) {
        super(chave);
        this.cor = 'r';
    }

    public void setCor(char c) {
        this.cor = c;
    }

    public char getCor() {
        return this.cor;
    }

    
}
