package basic;

public class MethodDemo4 {
  public static void main(String[] args) {
    // method 이름 add, 매개변수 2개 데이터타입 int
    // 2개 숫자 더해서 그 결과 반환하는 메서드 만들어라.   // 반환타입 int
    // add(2,3) ; add(10,20) ; add(100,200) ; 출력
    int a = 1_000_000, b = 2_000_000;
    long long1 = 1_000_000_000_000L, long2 =2_000_000_000_000L;
    System.out.println(longAdd(long1,long2));
    System.out.println(longMinus(long1,long2));

    System.out.println(add(a,b));
    System.out.println(minus(a,b));
    System.out.println(multiply(a,b));
    System.out.println(longMltiply(a,b));
    System.out.println(divide(a,b));
    System.out.printf("%.4f \n",doubleDivide(a,b));
  }
  public static int add(int num1, int  num2) {
    return num1 + num2;
  }
  public static long longAdd(long num1, long  num2) {
    return num1 + num2;
  }

  public static int minus(int num1, int  num2){
    return num1 - num2;
  }
  public static long longMinus(long num1, long  num2){
    return num1 - num2;
  }

  public static int multiply(int num1, int  num2){
    return num1 * num2;
  }

  public static long longMltiply(int num1, int  num2){
    return (long)num1 * num2;
  }

  public static int divide(int num1, int  num2){
    if(num2 == 0) return 0;
    return num1 / num2;
  }
  public static double doubleDivide(int num1, int  num2){
    if(num2 == 0) return 0;
    return (double) num1 / num2;
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
