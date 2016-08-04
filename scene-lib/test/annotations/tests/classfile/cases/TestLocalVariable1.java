package annotations.tests.classfile.cases;

import java.util.Set;

public class TestLocalVariable1<T> extends Object {
  public int i;

  public Set<Set> s;

  public TestLocalVariable1() {
    int t = 0;
    i = 0;
  }

  public TestLocalVariable1(int i) {
    this.i = i;
  }

  public TestLocalVariable1(Integer j) {
    int k = 1;
    k++;
    this.i = j;
    k--;
    this.i = k;
  }

  public int i() {
    return i;
  }

  public int j() {
    int temp = 1;
    return j();
  }

  public static void someMethod() {
    TestLocalVariable1 t = new TestLocalVariable1();
    String s = new String();
    Double d = Double.valueOf(2);
  }

  public static void main(String[] args) {
    boolean b = true;
    boolean b1 = Boolean.TRUE;
    boolean b2 = (boolean) Boolean.FALSE;
    b = b1 && b2;
    if (b || b2) {
      b1 = b;
    }
    if (b1) {
      System.out.println("Message");
    }
  }
}
