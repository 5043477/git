class Main {
  public static void main(String[] args) {
    //objects are created from classes

    sum(2,3);

    Subtract t = new subtract(10,5);

    System.out.println(t.difference);

    Multiply m = new Multiply(5,5);

    System.out.println(m.productOf());

    Divide d = new Divide(20,4);

    System.out.println(d.quotientOf());

  }


  static int sum(int num1, int num2);
  {
  return num1 + num2;  
  }
}