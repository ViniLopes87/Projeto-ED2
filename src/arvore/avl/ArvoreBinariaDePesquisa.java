package arvore.avl;

public class ArvoreBinariaDePesquisa extends AbstractArvoreBinariaDePesquisa<No> {
    @Override
    public No novoNode(int key) {
        return new No(key);
    }

    @Override
    public No inserir(int key) {
        return inserirNoHelper(raiz, key);
    }

    @Override
    public No procurar(int key) {
        return procurarNoHelper(raiz, key);
    }

    @Override
    public No deletar(int key) {
        return deletarNoHelper(raiz, key);
    }
}