public class qw10
{
    public static void main(String args[])
    {
        int a=1,b=1,c=0,p=2,ctr=0,x,d=0;
        while(c>0)
        {
            c=a+b;
            x=c;
            p++;
            while(c>0)
            {
                d=x%10;
                ctr++;
                x=x/10;
            }
            if(ctr==1000)
            {
                System.out.println(p);
                break;
            }
            ctr=0;
        }
    }
}