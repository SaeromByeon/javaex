package basic;

public class IncreasementDemo {
  public static void main(String[] args) {
    int x = 0;
    System.out.println("increasement 메소드 호출 전 x = " + x);
    increasement(x);
    System.out.println("increasement 메소드 호출 후 x = " + x);
    
    
  }
  
  public static void increasement(int n) {
    System.out.println("increasement 메소드 시작 n = " + n);
    n++;
    System.out.println("increasement 메소드 시작 n = " + n);
    
  }
}
