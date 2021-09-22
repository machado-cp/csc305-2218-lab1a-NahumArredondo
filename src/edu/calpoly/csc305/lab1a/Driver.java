package edu.calpoly.csc305.lab1a;

class Driver {
  public static void main(String[] args) {
    Example ex = new Example();
    int[] list = {1, 2, 3, 4, 21};
    int total = 0;
    int x = 0;

    ex.driver("name", list);
    System.out.println(ex.sameName("name"));

    while (x != list.length) {
      int num = ex.getNums()[x];
      total += num;
      x += 1;
    }

    System.out.println(total);
  }
}

