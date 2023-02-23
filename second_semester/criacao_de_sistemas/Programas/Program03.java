// import javax.swing.*;

import javax.swing.JOptionPane;

class Programa03 {
    public static void main(String entrada[]) {
      String mensagem = "Resultado da: ";
      double raizUm, raizDois;
      int inputUm, inputdois, quociente;

      inputUm = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
      inputdois = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro: "));

      quociente = inputUm % inputdois;
      raizUm = Math.sqrt(inputUm);
      raizDois = Math.sqrt(inputdois);

      mensagem = mensagem + "Raiz quadrada de " + inputUm + " = " + raizUm + "\n";
      mensagem = mensagem + "Raiz quadrada de " + inputdois + " = " + raizDois + "\n";
      mensagem = mensagem + "Resto da divisão de " + inputUm + " por " + inputdois + " = " + quociente + "\n";

      System.exit(0);

    }
}
