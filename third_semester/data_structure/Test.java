public class Test {
  public static void main (String entrada[]) {
    // int myNum = 5;
    // float myFloatNum = 5.99f;
    // char myLetter = 'D';
    // boolean myBool = true;
    // String myText = "Hello";

    int x = 5, y = 6, z = 50;
    System.out.println(x + y + z);

    byte myNum = 100;
    System.out.println(myNum);

    short otherNum = 5000;
    System.out.println(otherNum);

    float f1 = 35e3f;
    double d1 = 12e4d;
    System.out.println(f1);
    System.out.println(d1);

    double myDouble = 9.78d;
    int otherInt = (int) myDouble; // casting mannualy
    System.out.println(otherInt);

    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate")); // Outputs 7

    final char example = 'B';
    System.out.println(example);

    int time = 20; // operador ternário, ternary
    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result); 

    System.out.println("Java no vscode com sucesso.");
  }
}
