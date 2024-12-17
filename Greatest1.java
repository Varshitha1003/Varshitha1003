public class Greatest1
{  
    void max(int a,int b)
    {
       if(a>b)
        System.out.println(a+"is a greatest number");
        else
        System.out.println(b+"is a greatest number"); 
    }
    public static void main(String args[])
    {
        int num1,num2;
        num1=50;
        num2=100;
        Greatest max1=new Greatest();
        max1.max(num1, num2);
    }
}