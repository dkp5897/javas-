package javaEclips;

public class lower_case_and_upper_case {
	
	static String cases(String S) {
		for(int i=0; i<S.size(); i++){
            if(S[i]>='A'&& S[i]<='Z')
                S[i] += 'a' - 'A';
        }
        return S;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
