package JavaClass;

public class lab08 {

	public static void main(String[] args) {
        int[] nums = {5,10,3,2,7,8,9};

        int target = 14;
        int index1 = 0, index2 = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	for(int j = 0; j < nums.length; j++) {
        		if(nums[i] + nums[j] == target && i != j) {
        			index1 = j;
        			index2 = i;
        			break;
        		}
        		else
        			continue;
        	}
        		
        }
        
        System.out.println("[" + index1 + "," + index2 + "]");

	}

}
