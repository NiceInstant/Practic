import java.util.Scanner;
import java.io.*;

public class Start {

	public static void main(String[] args) {
		
//		System.out.println("Сумма = " + strt(10, 3, 5,7));
		JeckaProject jp = new JeckaProject();
		//jp.recursionFucn(3);
		
	}

	static int strt(int lim, int ... delitel) {
		
		int n = 0;
 
		for (int i = 0; i < lim; i++) {
			for(int d : delitel) {
				if (i % d == 0) {
					n += i;
					continue;
				}
			}
		}
		return n;
	}	
	
	
	
}
	