import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {4,2,6,5,2};
        System.out.println(twoSum(numbers, 4));
    }

    public static boolean twoSum(int[] arr, int target) {
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i =0;i< arr.length; i++) {
            if(map.containsKey(target - arr[i])) {
                return true;
            }
            map.put(arr[i], true);
        }
        return false;
    }
}
