class UnboundedSearch {

    public static int unboundedSearch(int[] arr, int target) {

        if (arr[0] == target) {
            return 0;
        }

        int i = 1;

        // Expand the search range exponentially
        while (arr[i] < target) {
            i = i * 2;
        }

        int s = i / 2;
        int e = i;

        // Normal Binary Search
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};

        System.out.println(unboundedSearch(arr, 17));
    }
}