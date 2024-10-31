package Utils;

interface ValueComparator{
    int compare(int value1, int value2);
}

public class OpenClosedExample {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 3};
        sortArray(arr, new AscComparator());
//        sortArray(arr, new DescComparator());
        System.out.println("Values in array are: ");
        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
    }

    public static final void sortArray(int arr[], ValueComparator comparator) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[i], arr[j]) > 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}
class AscComparator implements ValueComparator {

    @Override
    public int compare(int value1, int value2) {
        return value1 - value2;
    }
}



class DescComparator implements ValueComparator {
    @Override
    public int compare(int value1, int value2) {
        return value2 - value1;
    }
}
