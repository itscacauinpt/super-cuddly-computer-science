import javax.swing.JOptionPane;

// import java.util.Queue;

class Dealing_with_queues
{
  int tamanhoFila, totalFila, vetorFila[];
  int ultimoIndex, inicioIndex;

  Dealing_with_queues(int tam)
  {
    totalFila = 0;
    tamanhoFila = tam;
    vetorFila = new int[tam];
  }

  public boolean FilaVazia()
  {
    if (tamanhoFila == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  };

  public boolean FilaCheia()
  {
    if (totalFila >= tamanhoFila)
    {
      return true;
    }
    else
    {
      return false;
    }
  };

  public void Enfileirar(int novoElemento)
  {
	  if (!FilaCheia())
	  {
		  vetorFila[ultimoIndex] = novoElemento;
		  ultimoIndex += 1;
		  tamanhoFila += 1;

		  if (ultimoIndex >= tamanhoFila)
		  {
			  ultimoIndex = 0;
		  }
	  }
    else
    {
      System.out.println("Fila cheia: " + tamanhoFila);
    }
  };

  public int Desenfileirar()
  {
    int	elementoDeletado = 0;

    if (FilaVazia())
    {
      System.out.println("Fila vazia");
    }
    else
    {
      elementoDeletado = vetorFila[inicioIndex];
      inicioIndex += 1;
      totalFila -= 1;

      if (inicioIndex >= tamanhoFila)
      {
        inicioIndex = 0;
      }
    }
    return elementoDeletado;
  };

  public void RetornaElementoInicio()
  {
    if (!FilaVazia())
    {
      System.out.println("Elemento: " + vetorFila[inicioIndex]);
    }
    else
    {
      System.out.println("Fila Vazia.");
    }
  }

  // public void MostrarFila()
  {
    // JOptionPane.showMessageDialog(null, vetorFila); // tendi nada maluco
  }
  public void MostrarFila()
  {
    if (!FilaVazia())
    {
      for (int index = 0; index <= tamanhoFila; index++)
      {
        JOptionPane.showMessageDialog(null, "Elemento: " + vetorFila[index] + " - Índice: " + index);
      }      
    }
    else
    {
      System.out.println("Fila Vazia.");
    }
  }
}
