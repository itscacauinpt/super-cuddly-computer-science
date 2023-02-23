import javax.swing.JOptionPane;

public class ProgRepeticao {
  
  public static void main(String entrada []) {
    
    int tabuada;
    char op = 0;
    String msg = "", msgEntr = "Digite 1 repeticao com o metod for\nDigite 2 para repeticao com while\nDigite 3 para reticao com do/while";

    tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada de: "));
    op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

    switch (op) {
      case '1':
        {
          msg = msg + "Tabuada do " + tabuada + " pelo for: \n\n";
          for(int i=1; i<=10; i+=1) {
            msg = msg + tabuada + " x " + i + " = " + tabuada*i + "\n";
          }
          break;
        }
      case '2':
      {
        msg = msg + "Tabuada do " + tabuada + " pelo for: \n\n";
        int i = 1;
        while(i<=10) {
          msg = msg + tabuada + " x " + i + " = " + tabuada*i + "\n";
        }
        break;
      }
      case '3':
      {
        msg = msg + "Tabuada do " + tabuada + " pelo for: \n\n";
        int i = 1;
        do {
          msg = msg + tabuada + " x " + i + " = " + tabuada*i + "\n";
        } while(i<=10);
        break;
      }
      default: JOptionPane.showMessageDialog(null, "Opcao invalida");
        break;
    }

    if (op >= '1' && op <= '3') {
      JOptionPane.showMessageDialog(null, msg);
    }
    System.exit(0);
  }
}

// Atividade

class ProgRepeticaoAtividade15 {

	public static void main (String entrada[]) {
		int input1, input2, produto = 0;
		char option;
	  String msg = "", msgEntr = "Digite 1 para produto\nDigite 2 para produtoria\n";
		 
		input1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
		input2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
		option = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
	  switch(option) {
		  case '1':
		    {
			    if (input1 > 0 && input2 > 0) {
				  produto = input1 * input2;
			  }
				  msg = msg + "Produto de " + input1 + " por " + input2 + " = " + produto + "\n\n";
			 	 
			  break;
		    }
		  case '2':
		    { 
		      for(int i=1; i <= input2; i+=1) {
				  produto *= input1;
			  }	
			  msg = msg + "Produtoria de " + input1 + ", " + input2 + " vezes eh " + produto + "\n\n";
			  break;
		    }	  
		  default: JOptionPane.showMessageDialog(null,"Opcao invalida, calculos nao realizados");
	 }


  if (option >= '1' && option <= '2') {
    JOptionPane.showMessageDialog(null, msg);
  }
  System.exit(0);
  }
}
