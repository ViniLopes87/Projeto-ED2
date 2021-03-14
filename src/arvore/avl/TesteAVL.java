package arvore.avl;

public class TesteAVL {
    public static void main(String[] args) {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(50);
        a.inserir(60);
        a.inserir(70);
        a.inserir(80);
        a.inserir(90);
        a.inserir(100);
        
        
        BinaryTreePrinter<No> p = new BinaryTreePrinter<No>(a);
        p.imprimir(System.out);
    }
}
