package exercise15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {
	public static void move(List<Integer> arr, int i) {
		if(arr.get(i) >= arr.get(i-1)) return;
		int temp = arr.get(i-1);
		arr.set(i-1, arr.get(i)); 
		arr.set(i, temp);
		
		if(i >= 2) move(arr, i-1);
	}
	
	public static void main(String[] args) {
		List<Integer> lottoNum = new ArrayList<Integer>(6);
		Random rand = new Random();
		while(lottoNum.size() < 6) {
			int randNum = rand.nextInt(45) + 1;
			if(!lottoNum.contains(randNum))
				lottoNum.add(randNum);
		}
		
		for(int i = 1; i < lottoNum.size(); i++)
			move(lottoNum, i);
		
		for(int i : lottoNum)
			System.out.println(i);
	}
}
