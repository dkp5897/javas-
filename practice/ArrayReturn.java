import java.text.NumberFormat.Style;

public class ArrayReturn {

    public static int[] Arrayreturn()
    {
        // return array
        return new int[]{4,8,2,6};
    }
    
    public static void main(String[] args) {
        int arr[]=Arrayreturn();
        for(int e:arr)
        System.out.print(e+" ");

        int sum=0,pdt=1;
        for(int e:Arrayreturn())
        {
            sum+=e;
            pdt*=e;
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(pdt);

    }
}
