public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] list = {9,2,4,5,3,8,7,4,1};

        insertionSort.displayList(list);
        System.out.println();
        insertionSort.sort(list);
        insertionSort.displayList(list);
    }
}
