public class QuickSort implements MySort {
    // big o      best : nlogn   worst : n^2
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
    }
    public void quickSort(int[] array, int start, int end){
        if (start >= end)
            return ;
        // Partition
        var leftBoundary = partition(array, start, end);

        quickSort(array, start,leftBoundary-1);
        quickSort(array, leftBoundary+1, end);
    }
    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        var boundary = start - 1;
        for (int i = start ; i <= end ; i++) {
            if (array[i]<=pivot) {
                swap(array, ++boundary, i);
            }
        }
        return boundary;
    }
    private void swap (int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
