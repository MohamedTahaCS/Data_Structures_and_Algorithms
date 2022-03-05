public class SelectionSort implements MySort {
    // big O(2^n)
    public void sort(int[] array) {
        for (int i=0 ; i<array.length ; i++) {
            int minIndex = findMinIndexFromItoN(array,i);
            swap(array,i,minIndex);
        }
    }
    private int findMinIndexFromItoN(int[] array, int i) {
        var minIndex = i;
        for (int j=i ; j<array.length ; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
    }
    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
