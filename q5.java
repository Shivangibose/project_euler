public class q5 // to find the smallest positive number that is evenly divisible by all of the numbers from 1 to 20.

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
                break;

            }

            f=0;

        }

    }

}
