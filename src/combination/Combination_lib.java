package combination;

public class Combination_lib {
	
	public int getFactorial(int n) {//n�̊K��
		int f = 1;
		do {
			f = f * n;
			n--;
		}while(n>1);
				
		return f;
	}
}