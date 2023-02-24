public class dealing_with_stacks {
  int topo, tamanho;
  int[] vetor;

  public boolean PilhaVazia() {
    if (topo == -1) {
      return true;
    } else {
      return false;
    }
  };

  public boolean PilhaCheia() {
    if (topo >= tamanho-1) {
      return true;
    } else {
      return false;
    }
  };

  public void Empilhar(int Elemento) {
    if (!PilhaCheia()) {
      topo += 1;
      vetor[topo] = Elemento;
    } else {
      System.out.println("Pilha Cheia");
    }
  };

  public int Desempilhar() {
    int  desempilhado = 0;

    if (PilhaVazia()) {
      System.out.println("Pilha Vazia");
    } else {
      desempilhado = vetor[topo];
      topo -= 1;
    }

    return desempilhado;
  };

  public void ElementoTopo() {
    if (topo >= 0) {
      System.out.println("Elemento do topo: " + vetor[topo]);
    } else {
      System.out.println("Pilha vazia");
    }
  };
}
