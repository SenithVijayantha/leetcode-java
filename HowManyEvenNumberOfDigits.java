public class HowManyEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int element = 0;
        int count = 0;


        for (int i = 0; i < nums.length; i++) {
            int digitCount = 0;
            element = nums[i];

            if (element == 0) {
                count++;
                continue;
            }

            while (element != 0) {
                element = element / 10;
                digitCount++;
            }

            if (digitCount % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
