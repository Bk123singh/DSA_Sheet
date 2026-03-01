public class Search_In_Sorted_Arra_06 {

    public static int Search(int arra[], int si, int ei, int target) {

    // Base Case
    if (si > ei) {
        return -1;
    }

    int mid = si + (ei - si) / 2;

    // Target found
    if (arra[mid] == target) {
        return mid;
    }

    // Left part sorted
    if (arra[si] <= arra[mid]) {

        if (arra[si] <= target && target <= arra[mid]) {
            return Search(arra, si, mid - 1, target);
        } else {
            return Search(arra, mid + 1, ei, target);
        }
    }

    // Right part sorted
    else {

        if (arra[mid] <= target && target <= arra[ei]) {
            return Search(arra, mid + 1, ei, target);
        } else {
            return Search(arra, si, mid - 1, target);
        }
    }
}
    public static void main(String[] args) {
        int arra[]={4,5,6,7,0,3,1};
        System.out.println(Search(arra, 0, arra.length-1, 0));
    }
}
