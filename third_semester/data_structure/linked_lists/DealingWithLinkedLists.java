public class DealingWithLinkedLists
{
  No firstElement, lastElement;

  DealingWithLinkedLists ()
  {
    firstElement = null;
    lastElement = null;
  }

  public boolean EmptyList ()
  {
    if (firstElement == null && lastElement == null)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public void Destroy ()
  {
    firstElement = null;
    lastElement = null;
  }

  public int CountNo ()
  {
    int length = 0;
    No NoTemp = firstElement;

    while (NoTemp != null)
    {
      length += 1;
      NoTemp = NoTemp.nextAdress;
    }

    return length;
  }

  public void ShowList ()
  {
    int index = 1;
    No NoTemp = firstElement;

    while (NoTemp != null)
    {
      System.out.println("Element " + NoTemp.element + " position " + index);

      NoTemp = NoTemp.nextAdress;
      index += 1;
    }
  }

  public void FirstElement ()
  {
    if (!EmptyList())
    {
      System.out.println("First element " + firstElement.element);
    }
    else
    {
      System.out.println("Empty list");
    }
  }

  public void LastElement ()
  {
    if (!EmptyList())
    {
      System.out.println("First element " + lastElement.element);
    }
    else
    {
      System.out.println("Empty list");
    }
  }

  public void InsertFirstElement (No newNo)
  {
    if (EmptyList())
    {
      lastElement = newNo;
    }
    else
    {
      newNo.nextAdress = firstElement;
    }

    firstElement = newNo;
  }

  public void InsertLastElement (No newNo)
  {
    if (EmptyList())
    {
      firstElement = newNo;
    }
    else
    {
      lastElement.nextAdress = newNo;
    }

    lastElement = newNo;
  }

  public void InsertMiddleElement (No newNo, int index)
  {
    No NoTemp = firstElement;
    int QuantityNo, auxIndex = 1;

    QuantityNo = CountNo();

    if (index <= 1)
    {
      InsertFirstElement(newNo);
    }
    else
    {
      if (index > QuantityNo)
      {
        InsertLastElement(newNo);
      }
      else
      {
        while (auxIndex < (index - 1))
        {
          NoTemp = NoTemp.nextAdress;
          auxIndex += 1;
        }

        newNo.nextAdress = NoTemp.nextAdress;
        NoTemp.nextAdress = newNo;
      }
    }
  }

  // remove
  public void Remove (double discartElem)
  {
    No NoTemp = firstElement;
    No NoAnt = null;

    if (firstElement.element == discartElem)
    {
      firstElement = firstElement.nextAdress;
    }
    else
    {
      while (NoTemp != null && NoTemp.element != discartElem)
      {
        NoAnt = NoTemp;
        NoTemp = NoTemp.nextAdress;
      }
      if (NoTemp != null)
      {
        NoAnt.nextAdress = NoTemp.nextAdress;
      }
      if (NoTemp == lastElement)
      {
        lastElement = NoAnt;
      }
    }
  }
  // find No
  public No FindNo (double elementToFind)
  {
    int i = 1;
    No NoTemp = firstElement;

    while (NoTemp != null)
    {
      if (NoTemp.element == elementToFind)
      {
        System.out.println("No " + NoTemp.element + " posição " + i);
        return NoTemp;
      }
      i = i + 1;
      NoTemp = NoTemp.nextAdress;
    }
    return null;
  }
};
