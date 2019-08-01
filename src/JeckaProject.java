
public class JeckaProject {
	public static void main(String[] args) throws Exception {
		
		try {
			System.out.print(fib(33));
		}
		catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	public int febonachi() {
		int fib1 = 1;
		int fib2 = 1;
		int sum = 0;

		while (fib2 < 4000000) {

			fib2 = fib1 + fib2;
			fib1 = fib2 - fib1;

			if (fib2 % 2 == 0) {
				sum += fib2;
			}
		}
		System.out.print(sum);
		return sum;
	}

	public static int fib(int i) throws Exception {
		
			if(i<=0) {
				throw new IllegalArgumentException("Неверный индекс");
			}
			
			if (i == 1) {
				return 1;

			} 
			if (i == 2) {
				return 2;

			} 
				int sum = fib(i - 2) + fib(i - 1);
				if (sum > 4000000) {
					throw new Exception("Превышено значения числа febonachi в 4 000 000");
				}
							
				return sum ;
	}
}
