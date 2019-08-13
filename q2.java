public class q2 // by considering the terms in the fibonacci series whose value does not exceed 4 million .find the sum of the even valued terms
{
    public static void main(String args[])
    {
        int a=1,b=2,s=2,c=0;
        while(c<4000000)
        {
            c=a+b;
            if(c%2==0)
            {
                s=s+c;
            }
            a=b;
            b=c;
        }
        System.out.println(s);
    }
}
