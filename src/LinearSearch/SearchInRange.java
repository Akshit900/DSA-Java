package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {23, 34, 56, 89, 95};
        int target = 34;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int [] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i <= end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
