package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please choose a number.");
		int[]numbers = new int[in.nextInt()];

		boolean[] isPrime = new boolean [numbers.length];
		for(int value : numbers)
		{
		isPrime[value] = true;
		}
		
		for(int value : numbers)
		{
		isPrime[0] = false;
		for (int i = 0; i < numbers.length; ++i)
				{
			
				}
				}
		}

	}

}
