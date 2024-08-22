package objectpackage;

import java.util.Arrays;

public class StringArrayDemo {
  public static void main(String[] args) {
    String[] names = new String[3];

    System.out.println(Arrays.toString(names));

    names[0] = "hong kil-dong";
    names[1] = "son heung-min";
    names[2] = "lee kang-in";

    System.out.println(Arrays.toString(names));
    //foreach문 배열의 각 원소 문자열의 길이 출력
    for (String name : names) {
      System.out.println(name.length());
    }

  }
}
