public class Circle {
  public int radius;

  public Rectangle(int radius) {
    this.radius = radius;
  }
  public int getArea (){
    return 3.14 * radius * radius;
  }
  public int getPerimeter () {
    return 2 * 3.14 * radius;
  }
}
