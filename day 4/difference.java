class Mean
{
    public static void main(String[] args)
    {
        int[] myarray={66,79,84,53,28,17,91,35};
        float[] anarray=new float[8];
        float[] array2=new float[8];
        int sum=0;
        int sum2=0;
        float mean;
        for(int i=0;i<myarray.length;i++)
        {
            sum += myarray[i];
        }
        mean=(sum)/(myarray.length);
        System.out.println("mean="+mean);
        for(int i=0;i<myarray.length;i++)
        {
            for(int j=0;j<8;j++)
            {
                if (i == j)
                {
                    anarray[j] = myarray[i]-mean;
                }
            }
        }
        for(int j=0;j<8;j++)
        {
            System.out.print(" "+anarray[j]);
        }
        for(int j=0;j<8;j++)
        {
            for(int k=0;k<8;k++)
            {
                if(j==k)
                {
                    array2[k]=anarray[j]*anarray[j];
                }
            }
        }
        for(int k=0;k<8;k++) {
            System.out.println();
            System.out.print(" " + array2[k]);
        }
        for(int k=0;k<8;k++)
        {
            sum2 +=array2[k];
        }

        System.out.println("\nsum="+sum2);
        System.out.println("s.d="+(Math.sqrt((sum2)/8)));
        System.out.println("error="+((Math.sqrt((sum2)/8))/Math.sqrt(8)));
    }
}