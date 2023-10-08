package Module2.Moule1;

import java.util.Scanner;

public class test3 {
    static void printM(int height)
{
	int i, j, counter = 0;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j <= height; j++)
		{
			if (j == height)
				System.out.printf("*");
			else if (j == counter
					|| j == height - counter - 1)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		if (counter == height / 2)
		{
			counter = -99999;
		}
		else
			counter++;
		System.out.printf("\n");
	}
}

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
       printM(n);
    }
}
