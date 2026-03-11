package PassingObjToMethodsTest;

import java.util.Date;

public class TestDate {
  public static void main(String[] args) {
    Date date = new Date(1234567);
    m1(date);
    System.out.print(date.getTime() + " ");

    m2(date);
    System.out.println(date.getTime());
  }

  public static void m1(Date date) {
    date = new Date(7654321);
  }

  public static void m2(Date date) {
    date.setTime(7654321);
  }
}
