public class q6 // to find the difference between sum of square of first 100 natural number and square of the sum.
{
    public static void main(String args[])
    {
        int s1=0,s2=0;
        s1=(100*(100+1)*(2*100+1))/6;
        s2=(100*101)/2;
         
        System.out.println((s2*s2)-s1);
    }
}
