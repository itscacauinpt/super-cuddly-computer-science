package java_practice;
public class capituloI {
  public static int findmenor(int A[], int n) {
    int i, menor;
    menor = A[0];

    for (i = 0; i < n; i++) {
      if (A[i] < menor) {
        menor = A[i];
      }
    };
    return menor;
  }
  public static void main(String[] args) {
    int[] anArray = {1, 2, 4, 5, 6, 8};
    // capituloI.findmenor(meh, meh.length);
    System.out.println(capituloI.findmenor(anArray, anArray.length));
  }
}
