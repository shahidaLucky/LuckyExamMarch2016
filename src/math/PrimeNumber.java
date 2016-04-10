package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * 
		 */
		int numbersToBeChecked  = 100000;
		int i, j;
		int numberOfPrimeSofar = 0;
		boolean isPrime;

		for(i = 2; i<numbersToBeChecked; i++ )
		{
			isPrime = true;

			for( j = 2; j<i; j++)
			{
				if(i%j ==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(i);
				numberOfPrimeSofar++;
			}
		}
		System.out.println("Number of Prime so far"+ numberOfPrimeSofar);
	}
}

