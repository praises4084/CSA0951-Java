public class Transpose {
    public static void main(String[] args)
    {
        int[][]matrix={{3,1,2},
                {5,1,6},
                {1,5,3}};
        int[][]Transposedmatrix=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                Transposedmatrix[i][j]=matrix[j][i];
            }
        }
        System.out.println("Transposed matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(Transposedmatrix[i][j]+"");
            }
            System.out.println();
        }
    }
}