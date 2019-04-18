public class Main {

    public static void main(String[] args)
    {

        int number = 7;//Any number to check prime or not
        int temp=0;
        for(int i =2;i<=number-1;i++)
        {
            if(i%number==0)
            {
                temp=temp+1;

            }
        }
        if(temp>0)
        {
            System.out.println("Not prime");

        }
        else
        {
            System.out.println("prime");
        }
    }
}
