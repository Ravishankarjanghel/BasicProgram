package pattern;

public class Pat3_7_21 {

	public static void main(String[] args) {
		int n = 5;
		int k = 3;
		
		for(int i = 1;i<=n;i++) {
			int p = 1;
			for(int j = 1;j<=i;j++) {
				System.out.print(k*p+" ");
				p=p+2;
			}
			System.out.println();
			k=k*2+1;
		}

	}

}
