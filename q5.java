public class q5
{
    public static void main(String args[])
    {
        int f=0;
        for(int x=1;x>0;x++)
        {
            for(int i=1;i<=20;i++)
            {
                if(x%i==0)
                f++;
            }
            if(f==20)
            {
                System.out.println(x);
            }
            f=0;
        }
    }
}