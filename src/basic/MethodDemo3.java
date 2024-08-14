package basic;

public class MethodDemo3 {
  public static void main(String[] args) {
    // method 이름 add, 매개변수 2개 데이터타입 int
    // 2개 숫자 더해서 그 결과 반환하는 메서드 만들어라.   // 반환타입 int
    // add(2,3) ; add(10,20) ; add(100,200) ; 출력
    int a = 10, b = 5;
    System.out.println(add(a,b));
    System.out.println(minus(a,b));
    System.out.println(multiply(a,b));
    System.out.println(divide(a,b));
  }
  public static int add(int num1, int  num2) {
    return num1 + num2;
  }

  public static int minus(int num1, int  num2){
    return num1 - num2;
  }

  public static int multiply(int num1, int  num2){
    return num1 * num2;
  }

  public static int divide(int num1, int  num2){
    if(num2 == 0) return 0;
    return num1 / num2;
  }
  //    int result = 2 + 3;
//    System.out.println(result);
//
//    result = 10 + 20;
//    System.out.println(result);
//
//    result = 100 + 200 ;
//    System.out.println(result);
}
