public class CountingSort implements MySort {
    public void sort(int[] array) {
        int max = 0;
        for (var x : array) max = Math.max(max,x);
        int[] counts = new int[max+1];
        for (var x : array) counts[x] ++;
        int k = 0;
        for (int i=0 ; i<counts.length ; i++) {
            for (int j=0; j<counts[i]; j++)
                array[k++] = i;
        }
    }
}
