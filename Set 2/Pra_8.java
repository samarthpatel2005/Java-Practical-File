public class Pra_8 {
    public static int array_count9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 9};
        int[] nums2 = {1, 9, 9};
        int[] nums3 = {1, 9, 9, 3, 9};

        Pra_8 obj = new Pra_8();
        System.out.println("Number of 9's in nums1: " + obj.array_count9(nums1));
        System.out.println("Number of 9's in nums2: " + obj.array_count9(nums2));
        System.out.println("Number of 9's in nums3: " + obj.array_count9(nums3));

        System.out.println("Number of 9's in nums1: " + array_count9(nums1));
        System.out.println("Number of 9's in nums2: " + array_count9(nums2));
        System.out.println("Number of 9's in nums3: " + array_count9(nums3));
        System.out.println("23DCS089_Samarth Patel");
    }
}
