package Patterns;

public class Pattern3 {
	/*
   10101
    0101
     101
      01
       1*/
	public static void main(String args[])
	{
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<i;j++)
        {
            System.out.println("");
        }
        for(int k=i;k<5;k++)
        {
            System.out.print(k%2);
        }
    }
    System.out.println(" ");
	}
}
