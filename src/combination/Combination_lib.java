package combination;

public class Combination_lib {
	
	public int getFactorial(int n) {//n‚ÌŠKæ
		int f = 1;
		do {
			f = f * n;
			n--;
		}while(n>1);
				
		return f;
	}
}