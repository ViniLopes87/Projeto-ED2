package arvore.avl;

public class No {
    private int chave;

    public No esquerda;
    public No direita;
    public No pai;
    public int fator;

    public No(int chave) {
        this.chave = chave;
    }

    public int getChave() {
        return chave;
    }
    
    public int getFator(){
        return fator;
    }
    
    public void setFator(int fator){
        this.fator = fator;
    }

    @SuppressWarnings("unchecked")
    public <T extends No> T getEsquerda() {
        return (T) esquerda;
    }

    @SuppressWarnings("unchecked")
    public <T extends No> T getDireita() {
        return (T) direita;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }
    
    public void setDireita(No direita) {
        this.direita = direita;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
    
    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }
}