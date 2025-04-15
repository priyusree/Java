import java.util.*;

class pre {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sn.nextInt();
        }

        // Build frequency map (using HashMap for better performance)
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert to Integer[] for custom sorting
        Integer[] num = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = nums[i];
        }

        // Custom sort
        Arrays.sort(num, (n1, n2) -> {
            int freqCompare = map.get(n1) - map.get(n2); // Descending frequency
            if (freqCompare != 0) {
                return freqCompare;
            } else {
                return n2 - n1; // Ascending value when frequencies are equal
            }
        });

        // Print the sorted array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(num[i] + " ");
        }

        sn.close();
    }
}