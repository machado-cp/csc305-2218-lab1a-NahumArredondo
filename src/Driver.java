class Driver {
  public static void main(String args [])
  {
    Example ex = new Example();
    int total;

    while (true)
    {
      int num = ex.getNums()[0];
      total += num;
    }

    System.out.println(total);
  }
}

