class Product
{
    String productname;
    String shape;
    int validity;
    int price;
    void productinfo()
    {
        System.out.println(productname+","+shape+","+validity+","+price);
    }
}
public class ProductDemo
{
    public static void main(String args[])
    {

    Product product1=new Product();
    product1.productname="iphone";
    product1.shape="rectangle";
    product1.validity=5;
    product1.price=50000;
    product1.productinfo();
    }
}
