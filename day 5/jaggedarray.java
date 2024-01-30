class JaggedArrayExample {
    public static void main(String[] args)
    {
        int[][] jaggedArray = new int[3][];

        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};

        System.out.println(jaggedArray[0][1]);
        System.out.println(jaggedArray[1][0]);
        System.out.println(jaggedArray[2][3]);
    }
}
