import javax.swing.JOptionPane;

public class PraticaI_MediaAritmetica {
  public static void main(String[] args) {
    int vetorMedia[], i, media, soma = 0;
    vetorMedia = new int [50];

    for (i = 0; i < 50; i++) {
      vetorMedia[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
      soma += vetorMedia[i];
    };

    media = soma/50;
    // media = soma/5;

    System.out.println("A média das 50 notas digitadas é: " + media);
    System.exit(0);
  };
}
