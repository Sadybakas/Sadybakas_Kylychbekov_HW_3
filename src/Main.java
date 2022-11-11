public class Main {
    public static void main(String[] args) {
        double[] nums = {1.5,3.0,-6.5,-2.4,25.2,55.5,-15.4,8.8,3.8,7.0,11.5,-45.7,8.9,1.4,15.15} ;
        System.out.println("Srednoe arifmeticheskoe znachenie :" + arifmetic(nums));
    }




    public static double arifmetic (double [] nums){
        double sum = 0;
        boolean isNumberNegative = false;
        int n = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] < 0) {
                isNumberNegative = true;
            }
            if (nums[i] > 0) {
                if (isNumberNegative) {
                    sum = sum + nums[i];
                    n++;
                }
            }


        }return sum/n;
    }
}