import java.util.Vector;

public class C_vector {
    public static void main(String[] args) {
        Vector<Integer> vec=new Vector<>();
        for(int i=1;i<6;i++){
            vec.add(i);
        }

        System.out.println(vec);

        vec.remove(1);
        System.out.println(vec);

        for(int i=0;i<vec.size();i++){
            System.out.print(vec.get(i)+" ");
        }
    }
}
