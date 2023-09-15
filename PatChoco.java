import java.util.Scanner;

public class PatChoco 
{
    public static void main(String[] args) {
        Scanner scane = new Scanner(System.in);

        System.out.println("enter number :");
        int total_num = scane.nextInt();

        int i, j, x;
        x = total_num;

        for(i=1;i<=(total_num*2)-1;i++)
        {
            for(j=1;j<=(total_num*2)-1;j++)
            {
                if(i<=total_num)
                {
                    if(i==1)
                    {
                        System.out.print("  " + x);
                    }

                    else if(i>=2)
                    {
                        if(j<i)
                        {
                            System.out.print("  " + (x-j+1));
                        }
                        else if(j>=i && j<(total_num*2-i))
                        {
                            System.out.print("  " + (x-i+1));
                        }
                        else
                        {
                            System.out.print("  " + (j-x+1));
                        }
                    }
                }
                else if(i==total_num)
                {
                    if(j<=i)
                    {
                        System.out.print("  " + (x-j+1));
                    }
                    else
                    {
                        System.out.print("  " + (j-x+1));
                    }
                }
                else if(i>total_num)
                {
                    if(i==(total_num*2-1))
                    {
                        System.out.print("  " +  (x));
                    }
                    else if(i<(total_num*2-1))
                    {
                        if(j<=(total_num*2-1)-i)
                        {
                            System.out.print("  " +  (x-j+1));
                        }
                        else if(j>(total_num*2-1)-i && j<(total_num*2-1)-(total_num*2-1-i))
                        {
                            System.out.print("  " + (x-(total_num*2-1)+i));
                        }
                        else
                        {
                            System.out.print("  " +  (j-x+1));
                        }
                    }
                }
            }
            System.out.print("\n");
        }
    }    
}