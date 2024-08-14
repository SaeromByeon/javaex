package basic;

public class OverloadDemo {
  public static void main(String[] args) {
    // method 이름 add, 매개변수 2개 데이터타입 int
    // 2개 숫자 더해서 그 결과 반환하는 메서드 만들어라.   // 반환타입 int
    // add(2,3) ; add(10,20) ; add(100,200) ; 출력
    int a = 1, b = 2;
    long long1 = 1L, long2 = 2L;
    double da = 1.0, db =2.0;
    System.out.println(add(long1, long2));
    System.out.println(minus(long1, long2));
    System.out.println(add(a, b));
    System.out.println(minus(a, b));
    System.out.println(multiply(a, b));
    System.out.println(multiply(a, b));
    System.out.println(divide(a, b));
    System.out.printf("%.4f \n", divide(da, db));
  }

  //overloading
  public static int add(int num1, int num2) {
    return num1 + num2;
  }
  public static long add(long num1, long num2) {
    return num1 + num2;
  }
  public static int minus(int num1, int num2) {
    return num1 - num2;
  }
  public static long minus(long num1, long num2) {
    return num1 - num2;
  }
  public static int multiply(int num1, int num2) {
    return num1 * num2;
  }
  public static long multiply(long num1, long num2) {
    return num1 * num2;
  }

  public static int divide(int num1, int num2) {
    if (num2 == 0) return 0;
    return num1 / num2;
  }

  public static double divide(double num1, double num2) {
    if (num2 == 0) return 0;
    return num1 / num2;
  }
}

