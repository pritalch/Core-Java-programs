package Pattern;

public class printM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 6;
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a; j++) {
				if (j == 0 || j == a) {
					System.out.print(" * ");
				} else {
					if (j == (a / 2) && i == a / 2 || i < a / 2 && i + j == a || i < a / 2 && j == i) {
						System.out.print(" * ");
					} else {
						System.out.print("   ");
					}

					System.out.print("");
				}
			}
			System.out.println();
		}
	}

}
