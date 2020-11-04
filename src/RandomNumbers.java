import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumbers {

	public static void main(String[] args) {
		
//		random number will print every time we run this program
		
		Random random = new Random();
		int randonNumber = random.nextInt(100);//here we need to mention upto what range we need random number of.
		System.out.println(randonNumber);
		
		
		//Approach 2 for decimal
		
		System.out.println(Math.random());
		
		
		//Approach 3 - Apache commons-lang ApI
		
		String randNumber = RandomStringUtils.randomNumeric(10);
		
		System.out.println(randNumber);

	}

}
