package StaticKeyword;

public class TwoSum {
    static int[] result = new int[2];


    public static void main(String[] args) {
        int[] list = { 10,2,3,1,5};
        int target = 15;
        int[] ints = twoSum(list ,target);
        System.out.println(ints[0] +  " + " + ints[1] + " = " + target);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = nums[i];
                    result[1] = nums[j];
                    return result;
                }
            }
        }
        return null;
    }
}
