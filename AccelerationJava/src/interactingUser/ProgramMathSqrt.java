package interactingUser;

import javax.swing.JOptionPane;

class ProgramMathSqrt {
    public static void main(String entrada[]) {
      String mensagem = "";
      double raizUm, raizDois;
      int inputUm, inputdois, quociente;

      inputUm = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: "));
      inputdois = Integer.parseInt(JOptionPane.showInputDialog("Enter another(please) integer: "));

      quociente = inputUm % inputdois;
      raizUm = Math.sqrt(inputUm);
      raizDois = Math.sqrt(inputdois);

      mensagem += ""
    		  + "Raiz quadrada " + "|" + inputUm + " = " + raizUm + "|\n|"
    		  + "Raiz quadrada " + "|" + inputdois + " = " + raizDois + "|\n"
    		  + "Resto da divisão de " + inputUm + " por " + inputdois + " é igual a " + quociente;

      printMessage(mensagem);

      System.exit(0);
    }
    
    static void printMessage(String msg) {
    	System.out.println(msg);
    }
}
