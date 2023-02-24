import javax.swing.JOptionPane;

class ConstructClassStack {
  public static void main (String args []) {
    ClassStack intStack = new ClassStack(5);
    int i, input;

    for (i = 1; i <= 5; i++) {
      input = Integer.parseInt(JOptionPane.showInputDialog("Digit an integer value: "));
      intStack.PutStack(input);
    }

    intStack.ShowStack();
    System.exit(0);
  }
}

class ClassStack {
  int lengthStack, top;
  int[] vetor;

  ClassStack(int len) {
    top = -1;
    lengthStack = len;
    vetor = new int[len];
  };

  public boolean EmptyStack() {
    if (top == -1) {
      return true;
    } else {
      return false;
    }
  };

  public boolean FullStack() {
    if (top >= lengthStack-1) {
      return true;
    } else {
      return false;
    }
  };

  public void PutStack(int Element) {
    if (!FullStack()) {
      top += 1;
      vetor[top] = Element;
    } else {
      System.out.println("Full stack");
    }
  };

  public int Unstack() {
    int unstacked = 0;

    if (EmptyStack()) {
      System.out.println("Empty stack");
    } else {
      unstacked = vetor[top];
      top -= 1;
    }

    return unstacked;
  };

  public void LastElement() {
    if (top >= 0) {
      System.out.println("Last element: " + vetor[top]);
    } else {
      System.out.println("Empty stack");
    }
  };

  public void ShowStack() {
    for (int i = top; i >= 0; i--) {
      System.out.println("Element " + vetor[i] + " position " + i);
    }
  }
}
