package arvore.avl;

public class TesteAVL {
    public static void main(String[] args) {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(5);
        a.inserir(2);
        a.inserir(8);
        a.inserir(3);
        a.inserir(1);
        a.inserir(7);
        a.inserir(10);
        a.inserir(9);
        a.inserir(11);
        a.deletar(7);
        
        a.posOrdem();
        System.out.println();
        a.preOrdem();
        System.out.println();
        a.emOrdem();
        System.out.println();
        BinaryTreePrinter<No> p = new BinaryTreePrinter<No>(a);
        p.imprimir(System.out);
    }
}