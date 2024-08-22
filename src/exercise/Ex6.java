package exercise;

public class Ex6 {
  public static void main(String[] args) {
    Car c = new Car("파랑", 200 ,1000 , 5);
    c.show();

    Vehicle v1 = new Vehicle("빨강", 250);
    v1.show();

    System.out.println();
    Vehicle v = c;
    v.show();
  }
}

class Vehicle{
  String color;
  int speed;

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }

  void show(){
    System.out.println("색상은 " +color +", 속도는 " + speed);
  }
}

class Car extends  Vehicle{
  int displacement;
  int gears;

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }
  @Override
  void show(){
    System.out.println("색상은 " +color +", 속도는 " + speed+ ", 배기량은 "
        +displacement +", 기어 단수는 "+gears);
  }
}