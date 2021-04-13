package treeblackred;

//EQUIPE: JOÃO VITOR ÂNGELO PEREIRA,LUCAS MÜLLER CORREIA, VINICIUS LOPES DA SILVA//

public class TreeBlackRed extends AbstractArvoreBinariaDePesquisa<NoBR> {

    @Override
    public NoBR novoNode(int chave) {
        return new NoBR(chave);
    }

    @Override
    public NoBR inserir(int chave) {
      NoBR  n = inserirNoHelper(raiz, chave);
        BalanceaNo(n);
        return n;
    }

    @Override
    public NoBR procurar(int chave) {
        return procurarNoHelper(raiz, chave);
    }

    @Override
    public NoBR deletar(int chave) {
        NoBR n = deletarNoHelper(raiz, chave);
        BalancearDeletar(n);
        return n;
    }
    private void BalancearDeletar(NoBR x) {
        NoBR  atual = x;
        NoBR pai;
        NoBR s;
        NoBR sdir;
        NoBR sesq;
        pai = atual.getPai();
        while (x != raiz && x.getCor() == 'b') {
          if (x == x.pai.esquerda) {
            s = pai.getDireita();
            sesq = s.getEsquerda();
            sdir= s.getDireita();
            if (s.getCor()== 'r') {
              s.setCor('b');
              pai.setCor('r');
              RotacaoDir(pai);
              s = pai.getDireita();
              sesq = s.getEsquerda();
              sdir= s.getDireita();
            }
    
            if (sesq.getCor() == 'b' && sdir.getCor() == 'b') {
              s.setCor('r');
              x = pai;
              pai = x.getPai();
            } else {
              if (sdir.getCor() == 'b') {
                sesq.setCor('b');
                s.setCor('r');
                RotacaoDir(s);
                s = sdir;
              }
    
              s.setCor(pai.getCor());
              pai.setCor('b');
              sdir.setCor('b');
              RotacaoEsq(pai);
              x = raiz;
            }
          } else {
            s = pai.getEsquerda();
            sesq = s.getEsquerda();
            sdir= s.getDireita();
            if (s.getCor() == 'r') {
              s.setCor('b');
              pai.setCor('r');
              RotacaoDir(pai);
              s = pai.getEsquerda();
              sesq = s.getEsquerda();
              sdir= s.getDireita();
            }
    
            if (sesq.getCor() == 'b' && sdir.getCor() == 'b') {
                s.setCor('r');
                x = pai;
            } else {
              if (sesq.getCor()=='b') {
                sdir.setCor('b');
                s.setCor('r');
                RotacaoDir(s);
                s = pai.getEsquerda();
              }
    
              s.setCor(pai.getCor());
              pai.setCor('b');
              sesq.setCor('b');
              RotacaoDir(pai);
              x = raiz;
            }
          }
        }
        x.setCor('b');
      }
    public void BalanceaNo(NoBR no) {
        NoBR pai, avo;
        if (no.getPai() != null) {
            pai = no.getPai();
            while (pai.getCor() == 'r') {
                if (no.getPai() == no.getPai().getPai().getEsquerda()) {
                    NoBR node = no.getPai().getPai().getDireita();
                    if (node != null) {
                        if (node.getCor() == 'r') {
                            pai = no.getPai();
                            pai.setCor('b');
                            node.setCor('b');
                            avo = no.getPai().getPai();
                            avo.setCor('r');
                            no = no.getPai().getPai();
                        } else {
                            if (no == no.getPai().getDireita()) {
                                no = no.getPai();
                                RotacaoEsq(no);
                            }
                            pai = no.getPai();
                            pai.setCor('b');
                            avo = no.getPai().getPai();
                            avo.setCor('r');
                            RotacaoDir(no.getPai().getPai());
                        }
                    } else {
                        if (no == no.getPai().getDireita()) {
                            no = no.getPai();
                            RotacaoEsq(no);
                        }
                        pai = no.getPai();
                        pai.setCor('b');
                        avo = no.getPai().getPai();
                        avo.setCor('r');
                        RotacaoDir(no.getPai().getPai());
                    }

                } else if (no.getPai() == no.getPai().getPai().getDireita()) {
                    NoBR node = no.getPai().getPai().getEsquerda();
                    if (node != null) {
                        if (node.getCor() == 'r') {
                            pai = no.getPai();
                            pai.setCor('b');
                            node.setCor('b');
                            avo = no.getPai().getPai();
                            avo.setCor('r');
                            no = no.getPai().getPai();
                        } else {
                            if (no == no.getPai().getEsquerda()) {
                                no = no.getPai();
                                RotacaoDir(no);
                            }
                            pai = no.getPai();
                            pai.setCor('b');
                            avo = no.getPai().getPai();
                            avo.setCor('r');
                            RotacaoEsq(no.getPai().getPai());
                        }
                    } else {
                        if (no == no.getPai().getEsquerda()) {
                            no = no.getPai();
                            RotacaoDir(no);
                        }
                        pai = no.getPai();
                        pai.setCor('b');
                        avo = no.getPai().getPai();
                        avo.setCor('r');
                        RotacaoEsq(no.getPai().getPai());
                    }
                }
            }
        }
        raiz.setCor('b');

    }

    public void RotacaoDir(NoBR atual) {
        NoBR aux, aux2, aux3;
        if (atual.getEsquerda().getDireita() != null) {
            aux = atual.getEsquerda().getDireita();
        } else {
            aux = null;
        }

        if (atual.getPai() != null) {
            aux2 = atual.getPai();
        } else {
            aux2 = null;
        }

        atual.getEsquerda().setDireita(atual);
        atual.setPai(atual.getEsquerda());
        atual.getEsquerda().setPai(aux2);
        aux3 = atual;
        while (aux3 != null) {
            aux3 = aux3.getEsquerda();
        }
        aux3 = aux;
    }

    public void RotacaoEsq(NoBR atual) {
        NoBR aux, aux2, aux3;
        if (atual.getDireita().getEsquerda() != null) {
            aux = atual.getDireita().getEsquerda();
        } else {
            aux = null;
        }

        if (atual.getPai() != null) {
            aux2 = atual.getPai();
        } else {
            aux2 = null;
        }

        atual.getDireita().setEsquerda(atual);
        atual.setPai(atual.getDireita());
        atual.getDireita().setPai(aux2);
        aux3 = atual;
        while (aux3 != null) {
            aux3 = aux3.getDireita();
        }
        aux3 = aux;
    }

    public static void main(String[] args) {
        TreeBlackRed a = new TreeBlackRed();        

        BinaryTreePrinter<NoBR> p = new BinaryTreePrinter<NoBR>(a);
        p.imprimir(System.out);
    }

}
