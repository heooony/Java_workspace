class Star {
	public static void main(String [] args) {
		int star = 5;

		for(int i = 0; i < star; i++) {
			for(int j = 0; j <= i; j++)
				System.out.print("¡Ú");
			System.out.println();
		}

		System.out.println("*****************************");

		for(int i = 0; i < star; i++) {
			for(int j = star; j > i; j--)
				System.out.print("¡Ú");
			System.out.println();
		}

		System.out.println("*****************************");

		for(int i = star; i > 0; i--) {
			for(int j = 0; j < i - 1; j++)
				System.out.print("  ");
			for(int j = star; j > i - 1; j--)
				System.out.print("¡Ú");
			System.out.println();
		}

		System.out.println("*****************************");

		for(int i = star; i > 0; i--) {
			for(int j = star; j > i ; j--)
				System.out.print("  ");
			for(int j = 0; j < i; j++)
				System.out.print("¡Ú");
			System.out.println();
		}
	}
}