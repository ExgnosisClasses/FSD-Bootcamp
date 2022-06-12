package demo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6};
		int [] powers = map(square,nums);
		
		for (int index = 0; index < nums.length; index++) {
			System.out.println(nums[index] + " " +powers[index]);
		}
		
	
	}	

	private static int[] map(Function<Integer, Integer> square2, int[] nums) {
		// TODO Auto-generated method stub
		return null;
	}

	static Function<Integer,Integer> square = x -> x * x;
}


