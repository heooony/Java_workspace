

class Lotto{

	public static void main(String[] args) {

		//변수 초기화
		int lottoNum [] = new int [6];
		Lotto lotto = new Lotto();
		
		//로또 번호 생성 및 출력
		lotto.createNumber(lottoNum);
		lotto.print(lottoNum);
		
		System.out.println();

		//내림차순 정렬 및 출력
		for(int i = 1; i < 6; i++)
			lotto.descendingOrder(lottoNum, i);
		lotto.print(lottoNum);

	}

	//숫자 6개에 대해 랜덤으로 수를 생성하고
	//check메소드를 지속적으로 실행하면서 중복을 피한다.
	public void createNumber(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			i = check(arr, i);
		}
	}

	//내림자순 메소드
	public void descendingOrder(int [] arr, int i) {
		if(arr[i] <= arr[i-1]) return;
		int temp = arr[i-1];
		arr[i-1] = arr[i];
		arr[i] = temp;
		
		if(i >= 2) descendingOrder(arr, i-1);
	}
	
	//랜덤 번호를 체크하는데, 만약 이전에 나왔던 수라면
	//return을 하면서 for이 한 번 더 돌수 있도록 count 수를 줄인다.
	public int check(int [] arr, int count) {
		for(int i = 0; i < count; i++) {
			if(arr[i] == arr[count])
				return count - 1;
		}
		return count;
	}

	//배열의 값을 출력하는 기능
	public void print(int [] arr) {
			for(int i = 0; i < arr.length; i++) {
				if(i == 0)
					System.out.print("[ ");
				System.out.print(arr[i] + " ");
				if (i == arr.length - 1)
					System.out.print("]");
		}
	}
}