package edu.calpoly.csc305.lab1a;

class Example {
  private String name;
  private int[] nums;

  public Example(String newName, int[] newNums) {
    this.name = newName;
    nums = newNums;
  }

  boolean sameName(String other) {
    return other.equals(name);
  }

  public int[] getNums() {
    return nums;
  }
}
