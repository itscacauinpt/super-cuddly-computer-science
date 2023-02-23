import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * AtividadePratica1
 */
public class AtividadePratica1 {

  public static void main(String[] args) throws IOException {
    Scanner scaneando = new Scanner(System.in);
    System.out.printf("Informe o nome do arquivo:\n");
    String caminhoArq = scaneando.nextLine();

    InputStream inputS = null;
    OutputStream outputS = null;

    try {
      inputS = new FileInputStream(caminhoArq);
      outputS = new FileOutputStream(caminhoArq);
      byte[] buffer = new byte[1024];

      int length;
      while ((length = inputS.read(buffer)) > 0) {
        outputS.write(buffer, 0, length);
      }
    } catch (Exception err) {
      //TODO: handle exception
      System.out.printf("Erro na abertura do arquivo: %s.\n", err.getMessage());
    }
    finally {
      inputS.close();
      outputS.close();
    }
  }
}