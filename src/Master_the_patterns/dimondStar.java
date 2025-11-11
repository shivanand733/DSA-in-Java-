package Master_the_patterns;

public class dimondStar {
	public static void main(String[] args) {
		for (int i = 1; i <= 5;i++) {
			for (int sp = 1; sp <= (5-i); sp++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i;j++) {
				if (i == 1 ||j == 1|| j == i) {
				System.out.print("* ");
			} else {
				System.out.print("  ");
			}
			}
			System.out.println();

		}
		for (int i = 1; i <= 4; i++) {
			for (int sp = 1; sp <=i; sp++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(5-i); j++) {
			if ( j == 1||j == (5-i)){
				System.out.print("* ");
			} else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}
	}
}
