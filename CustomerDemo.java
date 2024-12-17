class Customer
{
    String  customername;
    String product;
    int price;
    int age;
    void customerinfo()
    {
        System.out.println( customername+","+product+","+price+","+age);
    }
}
public class CustomerDemo{
    public static void main(String args[])
    {
        Customer customer1=new Customer();
        customer1.customername="stalin";
        customer1.product="laptop";
        customer1.price=50000;
        customer1.age=20;
        customer1.customerinfo();
    }
}