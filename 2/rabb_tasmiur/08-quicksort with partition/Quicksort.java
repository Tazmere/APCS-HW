public class Quicksort
{
    public void qSort(int[] a, int p, int r)
    {
        if(p<r)
        {
            int q = Partition(a, p,r);
            qSort(a, p, q-1);
            qSort(a, q+1, r);
        }
     }

     private int Partition(int[] a, int p, int r)
     {
         int x = a[r];

         int i = p-1;
         int temp=0;

         for(int j=p; j<r; j++)
         {
             if(a[j]<=x)
             {
                 i++;
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }

         temp = a[i+1];
         a[i+1] = a[r];
         a[r] = temp;
         return (i+1);
     }


     public static void main(String[] args)
     {
         Quicksort qsort = new Quicksort();
         int[] array = {5, 4, 7, 2, 1, 9, 3, 6, 10, 8};

         System.out.print("Original  Array : ");
         for(int i=0; i<array.length;i++)
         {
             System.out.print(array[i] + " ");
         }

         int length = array.length;

         qsort.qSort(array, 0, length-1);

         System.out.print("Sorted  Array : ");
         for(int i=0; i<array.length;i++)
         {
             System.out.print(array[i] + " ");
         }
     }
}