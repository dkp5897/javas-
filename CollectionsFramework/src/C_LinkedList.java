import java.util.LinkedList;

public class C_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> LList=new LinkedList<>();
        for(int i=0;i<5;i++){
            LList.add(i);
        }

        System.out.println(LList);

        LList.remove(4);                // it will 4 index element
        System.out.println(LList);

        LList.remove(3);
        System.out.println(LList);

        for(int i=0;i<LList.size();i++){
            System.out.print(LList.get(i)+" ");
        }
    }
}
