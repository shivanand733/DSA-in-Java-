package Master_the_patterns;

public class pattrenBrilliance {
public static void main(String[] args) {
	        int n = 7; // total number of lines
	        for (int i = 0; i < n; i++) {
	            int spaces, stars;
	            if (i <= n / 2) {
	                spaces = i;
	                stars = n - 2 * i;
	            } else {
	                spaces = n - i - 1;
	                stars = 2 * (i - n / 2) + 1;
	            }
	            for (int s = 0; s < spaces; s++) {
	                System.out.print(" ");
	            }
	            for (int st = 0; st < stars; st++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

}
}
