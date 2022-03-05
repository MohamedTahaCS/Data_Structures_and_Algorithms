public class InsertionSort implements MySort{
    // big o(2^n)
    public void sort(int[] array) {
        for (int i=1 ; i<array.length ; i++) {
            int current = array[i];
            int position = findPosition(array, i, current);
            array[position] = current;
        }
    }
    private int findPosition(int[] array, int i, int current) {
        int j = i - 1;
        while(j>=0 && current < array[j]) {
            array[j+1] = array[j];
            j--;
        }
        return j+1;
    }
}
