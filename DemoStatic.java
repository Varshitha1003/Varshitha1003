class Demo
{
static
{
System.out.println("Static block");
}
static void message()
{
System.out.println("Static method");
}
}
public class DemoStatic
{
public static void main(String args[])
{
Demo d=new Demo();
d.message();
}
}