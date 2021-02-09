class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		int arrayLength = array.length;

		max = array[0];
		
		for(int i = 1; i < arrayLength; i++) {
			if(max < array[i])
				max = array[i];
		}

		System.out.println("max: " + max);
	}
}