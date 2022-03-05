public class MergeSort implements MySort {
    // Divide and Conquer
    // big o( nlog(n) )
    // cost of Memory
    public void sort(int[] array) {
        if (array.length == 1)
            return ;

        int middle = array.length/2;

        int[] left = new int[middle];
        for (int i=0 ; i<middle ; i++)
            left[i] = array[i];

        int[] right = new int[array.length - middle];
        for (int j=middle ; j<array.length ; j++)
            right[j-middle] = array[j];

        sort(left);
        sort(right);
        merge(left,right,array);
    }
    private void merge(int[] left, int[] right, int[] result) {
        int i = 0 , j = 0 , x = 0;
        while(i<left.length && j<right.length) {
            if (left[i]<right[j])
                result[x++] = left[i++];
            else
                result[x++] = right[j++];
        }

        while(i<left.length)
            result[x++] = left[i++];

        while(j<right.length)
            result[x++] = right[j++];
    }

}
