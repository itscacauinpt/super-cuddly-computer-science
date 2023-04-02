package interactingUser;
import javax.swing.JOptionPane;

class ProgramVetor {

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

        matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro para a posicao " + linha + ":" + coluna));
        msgMatriz = msgMatriz + matriz[linha][coluna] + " ";
      }
      msgMatriz += "\n";
    }
    JOptionPane.showInputDialog(null, msgMatriz);
    System.exit(0);
  }
}
