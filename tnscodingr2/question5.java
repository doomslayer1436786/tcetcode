public class question5 {
    public static void moveEmptyCratesToEnd(int[] arr) {
        int nonEmptyIndex = 0;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is not zero, move it to the 'nonEmptyIndex'
            if (arr[i] != 0) {
                // Swap only if the nonEmptyIndex is different from the current index
                if (i != nonEmptyIndex) {
                    int temp = arr[nonEmptyIndex];
                    arr[nonEmptyIndex] = arr[i];
                    arr[i] = temp;
                }
                nonEmptyIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] crates = {0, 1, 0, 3, 12, 0, 5};
        moveEmptyCratesToEnd(crates);

        // Print the modified array
        for (int crate : crates) {
            System.out.print(crate + " ");
        }
    }
}
