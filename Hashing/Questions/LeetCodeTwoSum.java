import java.util.HashMap;
import java.util.Scanner;

class LeetCodeTwoSum{
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();  //Here, we take the array elements as keys, and their indices as values in the map

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){     // if (target-num[i]) is there in the map, we just return their indices
                return new int[] {map.get(target-nums[i]), i};   // Here, we are returning the indices in the form of array.
            }

            map.put(nums[i],i);  // If the above if condition is not specified, the value will automatically be added to te map.
        }
        return new int[2];  //if nums is empty, return empty array
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans[]= new LeetCodeTwoSum().twoSum(arr, target);
        for(int i:ans){
            System.out.print(i+" ");
        }


    }
}
