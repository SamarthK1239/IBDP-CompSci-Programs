public class EliminateRepeatElements {
    public static void main(String[] args){
        int[] arr = Searching.generateArray(100);
        removeDuplicates(arr, 100);
    }

    public static int removeDuplicates(int arr[], int n) {

        if (n == 0 || n == 1)
            return n;

        int temp[] = new int[n];

        int j = 0;
        int i;
        for (i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        temp[j++] = arr[n - 1];

        for (i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }
}
