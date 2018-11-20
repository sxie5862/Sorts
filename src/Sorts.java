public class Sorts {
    public static void ascendingSort(int[] arr)
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            int lowposition = i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[lowposition])
                    lowposition = j;
            }

            int temp = arr[i];
            arr[i] = arr[lowposition];
            arr[lowposition] = temp;
        }
    }

    public static void printarr(int[] arr)
    {
        for(int num : arr)
        {
            System.out.print(num +" ");
        }
        System.out.println();
    }

    public static void ascendingSort(String[] arr)
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            int lowposition = i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j].compareTo(arr[lowposition]) < 0)
                    lowposition = j;
            }

            String temp = arr[i];
            arr[i] = arr[lowposition];
            arr[lowposition] = temp;
        }
    }

    public static void printarr(String[] arr)
    {
        for(String num : arr)
        {
            System.out.print(num +" ");
        }
        System.out.println();
    }
}
