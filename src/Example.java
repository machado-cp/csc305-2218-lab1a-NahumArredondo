class Example
{
  static private int x;
  final private String name;
  private int[] nums;

  boolean sameName(String other)
  {
    return other == name;
  }

  public int[] getNums()
  {
    return nums;
  }
}  
