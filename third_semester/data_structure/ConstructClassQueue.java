import javax.swing.JOptionPane;

public class ConstructClassQueue
{
  public static void main (String args []) {
    int tam = 5;
    int i, input;
    Dealing_with_queues intQueue = new Dealing_with_queues(tam);

    for (i = 1; i <= tam; i++) {
      input = Integer.parseInt(JOptionPane.showInputDialog("Digit an integer value: "));
      intQueue.Enfileirar(input);
      // if (input % 2 == 0) // achando pares
      // {
      //   intQueue.Enfileirar(input);
      // }
    }

    intQueue.MostrarFila();
    System.exit(0);
  }
}
