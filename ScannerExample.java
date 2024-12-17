
public class ScannerExample
{
    public void result(int p)
    {
        if(p>=80)
        System.out.println("Grade A");
        else if(p>=60)
        System.out.println("Grade B");
        else if (p>=50)
         System.out.println("Grade c");
        else if (p>=40)
         System.out.println("Grade D");


    }
    public static void main(String args[])
    {
        int percentage=80;
        ScannerExample scexample=new ScannerExample();
        scexample.result(percentage);
    }
}