package objectpackage;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle(1);
    int radius = c1.getRadius();
    double area;
    System.out.println("원의 반지름 초기값 : " + radius);
    c1.setRadius(0);
    System.out.println("원의 반지름 변경값 : " + c1.getRadius());
    c1.printRadius();
    c1.getArea();
    area = c1.getArea();
    System.out.println("원의 넓이: " + area);
  }

}

