package basic;

public class MethodDemo2 {
  public static void main(String[] args) {
    //매개변수는 있고, 반환값은 없는 메소드로 작성하세요.
    oddOrEven(2); //짝수
    oddOrEven(5); //홀수
    oddOrEven(10); //짝수
  }
//    int num = 2;
//    String result = "";
//    if (num % 2 == 0) {
//        result = "짝수";
//    } else {
//      result = "홀수";
//    }

//    result = (num%2 ==0) ? "짝수": "홀수";
//    System.out.printf("%d는 %s입니다.\n", num, result);
//
//
//  num = 5;
//  result = "";
//  result = (num%2 ==0) ? "짝수": "홀수";
//    System.out.printf("%d는 %s입니다.\n", num, result);
//
//    num = 10;
//    result = "";
//    result = (num%2 ==0) ? "짝수": "홀수";
//    System.out.printf("%d는 %s입니다.\n", num, result);
//
//  }
//매개변수는 있고, 반환값은 없는 메소드로 작성하세요.
  public static void oddOrEven(int num) {
    String result = "";
    result = (num%2 == 0) ? "짝수" : "홀수";
    System.out.printf("%d는 %s입니다.\n", num, result);
  }
}