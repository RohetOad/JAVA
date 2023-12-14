package JavaClass;

public class driver {

	public static void main(String[] args) {
		int[] nums = {5,10,3,6,7,8,9};
        int index1 = 0, index2 = 0;
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] > max1) {
        		max1 = nums[i];
        		index1 = i;
        	}
        }
        for(int j = 0; j < nums.length; j++) {
        	if(nums[j] > max2 & nums[j] < max1) {
        		max2 = nums[j];
        		index2 = j;
        	}
        }

        System.out.println("[" + index1 + "," + index2 + "]");

	}

}
