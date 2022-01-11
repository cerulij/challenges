package Patterns.Factory;

public class Factory {


  public Shape createShape(String s) {
    if (s.equalsIgnoreCase("circle")) {
      return new Circle();
    }

    return null;
  }


  public static void main(String[] args) {
    Shape c = new Factory().createShape("circle");

    c.print();
  }

}
