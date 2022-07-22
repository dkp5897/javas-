public class sum_of_two_matrix {
    public static void main(String[] args) {
        int [][] a={{1,2,3},{2,3,4}};
        int [][] b={{1,7,10},{8,35,4}};
        int [][] sum={{0,0,0},{0,0,0}};
        for(int i=1; i<=a.length;i++)
        {
            for(int j=1;j<=a.length;j++)
            {
                sum[i][j]= a[i][j]+b[i][j];
            }
        }
        
        for(int i=1; i<=a.length;i++)
        {
            for(int j=1;j<=b.length;j++)
            {
                System.out.println(sum);
            }
            System.out.println(" ");

        }
    }
}
