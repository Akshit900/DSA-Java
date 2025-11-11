package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int [] num = {23,34,56,19,59};
        int target = 56;
        int ans = linearSearch(num , target);
        System.out.println(ans);

    }
    //Searching the Array : if found then return the element.
    //if not found then return -1.
    static int linearSearch(int [] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a loop.
        for (int i = 0; i < arr.length; i++) {
            //Checking for the item if it is = target.
            int element = arr[i];
            if(element == target){
                return  i;
            }

        }
        //for the value is not found.
        return -1;
    }
}
