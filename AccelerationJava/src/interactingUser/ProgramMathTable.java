package interactingUser;
import javax.swing.JOptionPane;

public class ProgramMathTable {
	  public static void main(String entrada []) {
	    int table;
	    char option = 0;
	    String msg = "", msgEntr = "Enter 1 to create math table wiht for loop\nEnter 2 to create math table with while loop\nEnter 3 to create math table with do/while loop";

	    table = Integer.parseInt(JOptionPane.showInputDialog("Math Table: "));
	    option = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

	    switch (option) {
	      case '1':
	        {
	          msg = msg + "math table " + table + ", using For Loop: \n\n";
	          for(int i=1; i<=10; i+=1) {
	            msg = msg + table + " x " + i + " = " + table*i + "\n";
	          }
	          break;
	        }
	      case '2':
		    {
		      msg = msg + "math table " + table + ", using While Loop: \n\n";
		      int i = 1;
		      while(i <= 10) {
		        msg = msg + table + " x " + i + " = " + table*i + "\n";
		        i += 1;
		      }
		      break;
		    }
	      case '3':
		    {
		      msg = msg + "math table " + table + ", using Do/While Loop: \n\n";
		      int i = 1; 
		      do {
		         msg = msg + table + " x " + i + " = " + table*i + "\n";
		         i += 1;
		      } while(i <= 10);
		      break;
		    }

	      default: JOptionPane.showMessageDialog(null, "Invalid option");
	      break;
	    }

	    if (option >= '1' && option <= '3') {
	      JOptionPane.showMessageDialog(null, msg);
	    }
	    System.exit(0);
	  }
}
