package flash_chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String pr = br.readLine();
		int p = Integer.parseInt(pr);
		String ns [] = new String [p];
		int n [] = new int [p];
		int nc [] = new int [p];
		for(int i = 0; i < ns.length; i++) ns[i] = br.readLine();
		for(int i = 0; i < ns.length; i++) n[i] = Integer.parseInt(ns[i]);

		for(int i=0; i<p-1; i++)
			for(int j=1; j<p-i; j++) {
				int a = i+j;
				if(n[a] == 0 || n[i] == 0) break;
				if(n[i]%n[a] == 0)
					nc[i]++;
				if(n[a]%n[i] == 0)
					nc[a]++;
			}
		for(int i : nc) System.out.println(i);
	}
}