public class BinarySearch {
    public int task(int target, int... array){
        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        while(left <= right){
            mid = (left + right) / 2;

            if(array[mid] == target){
                return mid;
            }else if(array[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return -1;
    }
}
