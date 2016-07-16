package Hochnt.ProcessLibrary;

import java.util.StringTokenizer;

public class ProcessString {
	public static void main(String[] args) {
		StringBuilder buil = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			buil.append("Phan tu thu " + i);
			buil.append("\n");
			
		}
		System.out.println(buil);
		
		//String tokenize
		String s = "a , b , c , ....... d , e ,f";
		StringTokenizer token = new StringTokenizer(s);
		while(token.hasMoreTokens()){
			//kiem ra con token khon
			System.out.println(token.nextToken());
		}
		
		StringTokenizer tk2 = new StringTokenizer(s, ",");
		while(tk2.hasMoreTokens()){
			//kiem ra con token khon
			System.out.println(tk2.nextToken());
		}
		System.out.println("-----------------------------");
		StringTokenizer tk3 = new StringTokenizer(s, ", ");
		while(tk3.hasMoreTokens()){
			//kiem ra con token khon
			System.out.println(tk3.nextToken());
		}
	}
}
