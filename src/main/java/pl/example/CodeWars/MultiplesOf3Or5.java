package pl.example.CodeWars;

public class MultiplesOf3Or5 {
	
	public int solution(int number) {
		int sum = 0;

		for (int i = 0; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		MultiplesOf3Or5 multiplesOf3Or5 = new MultiplesOf3Or5();
		multiplesOf3Or5.solution(10);
	}
}
