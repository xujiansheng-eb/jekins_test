import org.junit.Test;

public class My2Test {

  @Test
  public void t1(){
    System.out.println("2");
    String s  = null;
    final int length = s.length();
  }

  @Test
  public void ttt3(){
    System.out.println("2");
    String s  = null;
    int i = 1/0;
  }
}
