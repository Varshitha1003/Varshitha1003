public class Results
{
    void grade(int percentage)
    {
        if(percentage>=80)
        System.out.println("garde A");
        else if(percentage>=65)
        System.out.println("garde B");
        else if(percentage>=50)
        System.out.println("grade C");
        else
        System.out.println("garde D");
    }
    public static void main(String args[])
    {
        Results grade1=new Results();
        grade1.grade(80)
    }
}