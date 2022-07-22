import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayInputBufferdreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> A=new ArrayList<>();
		String[] line=br.readLine().split("//s+");
		for(int i=0;i<5;i++) {
            A.add(i,Integer.parseInt(line[i]));
        }
	for(int i=0;i<A.size();i++)
	{
		System.out.print(A.get(i));
	}
	}
}
