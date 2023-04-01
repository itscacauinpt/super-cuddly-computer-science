package interactingUser;
import javax.swing.*;

public class ProgramDecision {
  
  public static void main(String entrada[]) {    
    int num;
    char option = 0;
    String msg = "", msgEntr = "Digite 1 para descobrir se o nº é par ou impar\nDigite 2 para descobrir se o nº é positivo ou 5negativo";

    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    option = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

    switch (option) {
      case '1':
        {
          if(num % 2 == 0) {
            msg += num + " é par.\n";
          } else {
        	  msg += num + " é impar.\n";
          }
          break;
        }
      case '2':
        {
          if(num > 0) {
            msg = msg + num + " eh positivo.\n";
          } else {
            msg = msg + num + " eh negativo.\n";
          }
          break;
        }
      default: JOptionPane.showMessageDialog(null, "Opcao invalida");
      break;
    }

    if (option == '1' || option == '2') {
      JOptionPane.showMessageDialog(null, msg);
    }
    System.exit(0);
  }
}
