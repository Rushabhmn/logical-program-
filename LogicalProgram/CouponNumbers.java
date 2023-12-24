package LogicalProgram;

	import java.util.HashSet;
	import java.util.Random;
	import java.util.Set;

	public class CouponNumbers {

	    public static int generateRandomCoupon(int n) {
	        Random random = new Random();
	        return random.nextInt(n) + 1;
	    }

	    public static int generateDistinctCoupons(int n) {
	        Set<Integer> distinctCoupons = new HashSet<>();
	        int count = 0;

	        while (distinctCoupons.size() < n) {
	            int randomCoupon = generateRandomCoupon(n);
	            distinctCoupons.add(randomCoupon);
	            count++;
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int n = 10; // Replace 10 with the number of distinct coupon numbers you have
	        int totalRandomNumbers = generateDistinctCoupons(n);
	        System.out.println("Total random numbers needed to have all distinct coupons: " + totalRandomNumbers);
	    }
	}


