import javax.swing.*;

public class ProgMatriz {
  public static void soma (int vet[]) {
    int s=0;
    for (int i = 0; i<vet.length; i++)
    {
      s = s + vet[i];
    }
    JOptionPane.showMessageDialog(null, "A somatória é " + s);
  }

  public static int produto (int vet[]) {
    int p=1;
    
    for (int i = 0; i<vet.length; i++)
    {
      p = p * vet[i];
    }

    return p;
  }

  public static void main (String entrada[]) {
    int s=0, vetor[] = {2, 4, 6, 8, 10};
    int r;

    soma(vetor);
    r = produto(vetor);
    JOptionPane.showMessageDialog(null, "A produtoria é " + r);

  System.exit(0);
  }
}

//
// Atividade Prática 16
class VetoresDoUser {

  public static void soma (int vetor[]) {
    int soma = 0;
    for (int i = 0; i < vetor.length; i+=1)
    {
      soma = soma + vetor[i];
    }
    JOptionPane.showMessageDialog(null, "Soma dos vetores: " + soma);
  }

  public static int produto (int vetor[]) {
    int produto = 1;
    
    for (int i = 0; i < vetor.length; i+=1)
    {
      produto = produto * vetor[i];
    }

    return produto;
  }
  public static void main(String entrada[]) {
    int vetor[] = {0};
    int produto;

    for (int i = 0; i <= 5; i+=1)
    {
      vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    }

    soma(vetor);
    produto = produto(vetor);
    JOptionPane.showMessageDialog(null, "Produto: " + produto);

    System.exit(0);
  }
}
// Atividade Aula 16

class ProgMatrizAtividade16 {

  public static void main(String entrada[]) {
    // int vetor[] = (2, 4, 6, 8, 10);
    // String msgVetor = "";

    // for (int i = 0; i < vetor.length; i+=1) {
    //   msgVetor = msgVetor + vetor[i] + " ";
    // }
    // JOptionPane.showMessageDialog(null, msgVetor);

    int matriz[][] = new int [2][3];
    String msgMatriz = "";

    for (int linha = 0; linha < matriz.length; linha+=1) {

      for (int coluna = 0; coluna < matriz.length; coluna+=1) {

        matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro para a posicao " + linha + " e " + coluna));
        msgMatriz = msgMatriz + matriz[linha][coluna] + " ";
      }
      msgMatriz += "\n";
    }
    JOptionPane.showInputDialog(null, msgMatriz);
    System.exit(0);
  }
}
