
public class JeckaProject {
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
	
	public voi0d recursionFucn(int n ,int ) {
		
		if (n < 4000000 && n % 2 == 0) {
			System.out.println(sum);
		    recursionFucn(n+1);
		}
	    
	}
}
