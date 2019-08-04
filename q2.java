public class q2
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