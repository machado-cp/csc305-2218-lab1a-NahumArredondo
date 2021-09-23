package edu.calpoly.csc305.lab1a;

class Driver {
  public static void main(String[] args) {
    int[] list = {1, 2, 3, 4, 21};
    int total = 0;
    int x = 0;
    Example ex = new Example("name", list);

    System.out.println(ex.sameName("name"));

    while (x != list.length) {
      total += ex.getNums()[x];
      x += 1;
    }

    System.out.println(total);
  }
}
