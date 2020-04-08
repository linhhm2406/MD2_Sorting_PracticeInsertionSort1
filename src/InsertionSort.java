public class InsertionSort {

    public void sort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int currentValue = list[i];
            int k;
            for (k = i-1; k >=0  && list[k] > currentValue; k--) {
                    list[k+1] = list[k];
            }
            list[k+1] = currentValue;
        }
    }
    public void displayList(int[] list){
        for (int e:list) {
            System.out.print(e + " ");
        }
    }
}
