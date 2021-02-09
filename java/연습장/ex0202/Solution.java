class Solution {
	public static void main(String [] args) {
		double d = 9007199254740992.0;
		int count = 0;
		for(int i = 2; d != 1.0; ) {
			d = d / (double)i;
			count++;
		}
		System.out.println(count);
	}
}

