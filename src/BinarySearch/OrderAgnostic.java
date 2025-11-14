package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int [] arr = {-15, -12, -5, 0, 2, 4, 15, 22, 45, 55};
        int target =22;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }
    static int orderAgnostic(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;

            }if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
