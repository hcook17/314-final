import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int successes = 0;
		System.out.print("Enter a positive number of trials: ");
		Scanner input = new Scanner(System.in);
		int trials = input.nextInt();
		System.out.print("Enter the probability of getting heads between 0.00 and 1.00: ");
		double probability = input.nextDouble();
		headNum(trials, probability, successes);
	

	}

	
	public static void headNum(int trials, double probability, int successes) {
		int factorialTrials = 1;
		int factorialSuccesses = 1;
		int factorialDifference = 1;
		int difference = trials - successes;
		double q = 1.0 - probability;
		if(successes - 1 == trials) {
			return;
		}
		for(int i = trials; i > 1; i--) {
			factorialTrials *= i;
		}
		for(int i = successes; i > 1; i--) {
			factorialSuccesses *= i;
		}
		for(int i = difference; i > 1; i--) {
			factorialDifference *= i;
	}
		double pProbability = Math.pow(probability, successes);
		double qProbability = Math.pow(q, difference);
		double result = (factorialTrials / (factorialDifference * factorialSuccesses)) * pProbability * qProbability;
		System.out.println("For a number of " + successes + " heads, there is a " + result + " chance with " + trials + " trials");
		headNum(trials, probability, successes + 1);
		}
		
		
}

