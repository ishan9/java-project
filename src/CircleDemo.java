public class CircleDemo {
  public static void main (String[] args) {
    int radius = Integer.parseInt(args[0]);

    Circle myCircle = new Circle(radius);
    String output = String.format ("*** Your Circle ***\n\nRadius:%d\nArea:%d\nParameter:%d\n",myCircle.radius,myCircle.getArea(),myCircle.getPerimeter());
    System.out.println(output);
  }
}
