interface I1
{
  void m1();
  void m2();
}
interface I2
{
  void m1();
}
class C1 implements I1,I2
{
  public void m1()
  {
    System.out.println("m1 implemented in class C1");
  }
  public void m2()
  {
    System.out.println("m2 implemented in class C1");
  }
}
public class C1Main
{
  public static void main(String s[])
  {
    C1 obj1=new C1();
    obj1.m1();
    obj1.m2();
  }
}