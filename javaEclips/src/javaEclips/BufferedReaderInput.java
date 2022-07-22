package javaEclips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {

	public static void main(String[] args) throws IOException {
		
		// InputStreamReader s= new InputStreamReader(System.in);
		// BufferedReader br=new BufferedReader(s);

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int val=Integer.parseInt(br.readLine());
		System.out.println(str);
		System.out.println(val);

	}

}
