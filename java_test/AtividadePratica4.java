/**
 * AtividadePratica4
 */
public class AtividadePratica4 {

  // static class DivisaoPorZeroException extends Exception {
  //   public DivisaoPorZeroException() {
  //     super("O denomindaor de uma divisão não pode ser zero.");
  //   }
  // }

  public static int Atividade(String[] args) throws ArithmeticException {
    try {
      return 0/0;
    } catch (RuntimeException e) {
      return -1;
    } finally {
      
    }
  }
  // public static void main(String[] args) {
  //   // double resultado = 0;

  //   try {
  //     dividir(2, 0);
  //   } catch (Exception e) {
  //     System.err.println(e);
  //   } finally {
  //     System.out.println("O resultado é: ");
  //   }
  // }

  // private static double dividir(int numerador, int denominador) throws DivisaoPorZeroException {
  //   if (denominador == 0) {
  //     throw new DivisaoPorZeroException();
  //   }

  //   return numerador/denominador;
  // }
}