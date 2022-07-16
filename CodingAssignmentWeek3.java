package codingAssignmentWeek3;

public class CodingAssignmentWeek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		//the object is to create an array of int called ages that contains the values provided
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 74};
		
		int lastMinusFirst = ages[ages.length - 1] - ages[0];
		System.out.println(lastMinusFirst + " is the first element in the array subtracted from the last element in the array.");
		
	
		int sum = 0;
		for (int number : ages) {
			sum += number;
		}
		
		int average = sum / ages.length;
		System.out.println(average + " is the average age in the array.");
		

		//2
		//the object is to create an array of String called names that contains the values provided
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int sum2 = 0; {
		for (String name : names) {
			sum2 += name.length();
		}	
		
		
		int average2 = sum2 / names.length;
		System.out.println(average2 + " is the average number of letters per name.");
		
		String combineNames = "";
		for (int i = 0; i < names.length; i++) {
			combineNames += names[i] + " ";
			
		}
		System.out.println(combineNames);
		
		//3 - how do you access the last element of any array?
		//[arr.length] is used to access the last element in an array
		
		
		//4 - how do you access the first element in an array?
		//Array[0] is used to access the first element in an array
		
		
		//5
		//the object is to create a new array of int called nameLengths and write a loop to iterate over names array to add the length of each name
		int[] nameLengths = extractStringLengths(names); 
		for (int number : nameLengths) {
		System.out.println(number);
		}
		
		//6
		//the object is to write a loop to iterate over the nameLengths array and calculate the sum of all the elements
		int sum3 = 0;
		for (int name : nameLengths) {
			sum3 += name;
		}
		System.out.println(sum3);

		}
		
		//7
		//the object is to write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself
		System.out.println(wordRepeated("Hello", 7));
		
		
		
		//8
		// the object is to take two Strings and return a full name
		String firstName = "Peter";
		String lastName = "Jones";
		String fullName = makeFullName(firstName, lastName);
		System.out.println(fullName);
		
		//9
		//the object is to make a method that takes an array of int and returns true if the sum is greater than 100
		int[] values = {15, 32, 9, 24, 21};
		int total = 0;
		for (int number : values) {
			total += number;
		}
		int number2 = 100;
		System.out.println(isSumGreaterThan100(values));
		
		//10
		//the object is to write a method that takes an array of double and returns the average of all the elements
		double[] doubleNums = {14.9, 37.2, 24.19, 2.6};
		System.out.println(elementAverage(doubleNums));
		
		//11
		//the object is to write a method that takes two arrays of double and returns true if the average in the first array is greater than the second
		double[] secondDoubleNums = {8.1, 19.3, 42.6, 64.82};
		System.out.println(isFirstElementAvgGreater(doubleNums, secondDoubleNums));
		
		//12
		//the object is to write a method that takes a boolean and a double and returns true if both are greater than 10.50
		double isHotOutside = 97.5;
		double moneyInPocket = 7.25;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		//13
		//the object is to create a method of my own that solves a problem
		//the method I created will take a name and a birthday and add them together in order to make a list (I personally find this useful to keep track of all the birthdays in my household)
		String name = "Kat Chavez";
		String birthday = "July 16, 2016";
		System.out.println(peopleAndBirthdays(name, birthday));
		
		
	}		

	
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();		
	}
		return results;
}
	
	public static String wordRepeated(String word, int n) {
		String wordRepeated = "";
		for (int i = 0; i < n; i++) {
			wordRepeated += word;
	}
		return wordRepeated;
}
	
	public static String makeFullName(String x , String y) {
		return x + " " + y;
		
	}
	
	public static boolean isSumGreaterThan100(int[] array) {
		for (int arr : array) {
			return true;
			
		}
		return false;
		
	}
	
	public static double elementAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	public static boolean isFirstElementAvgGreater(double[]firstAverage, double[]secondAverage) {
		return elementAverage(firstAverage) > elementAverage(secondAverage);
	}
	
	public static boolean willBuyDrink(double isHotOutside, double moneyInPocket) {
		if (isHotOutside >= 90 && moneyInPocket >= 10.50) {
			return true;
		}
		return false;
	}
	
	public static String peopleAndBirthdays(String name, String birthday) {
		return name + " : " + birthday;
	}
	
}
