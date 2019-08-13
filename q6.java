public class q6 // to find the difference between sum of square of first 100 natural number and square of the sum.
{
    public static void main(String args[])
    {
        int s1=0,s2=0,p1;
        for(int a=1;a<=100;a++)
        {
            p1=a*a;
            s1=s1+p1;
        }
        for(int b=1;b<=100;b++)
        {
            s2=s2+b;
        }
        System.out.println((s2*s2)-s1);
    }
}
