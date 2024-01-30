public class findmaximumandminimum
{
    public static void main(String[] args)
    {
        int[] array ={2,5,3,7,4,9};

        int max = array[0];
        int min = array[0];

        for(int num:array)
        {

            if(num>max)
            {
                max =num;
            }

            if(num<min)
            {
                min = num;
            }


        }

          System.out.println("maximum value: " + max );
          System.out.println("minimum value:" + min);
    }


}
