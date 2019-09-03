package com.cg.labbook.labone;

public class LabOneAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		AssignmentOne one = new AssignmentOne();
		AssignmentTwo two = new AssignmentTwo();
		AssignmentThree three = new AssignmentThree();
		AssignmentFour four = new AssignmentFour();
		
		System.out.println("Enter any number: ");
		int num = scr.nextInt();
		
		System.out.println("the sum of first n natural numbers\r\n" + 
				"which are divisible by 3 or 5:" + one.calculateSum(num));
		System.out.println("the difference between the sum of the\r\n" + 
				"squares of the first n natural numbers and\r\n" + 
				"the square of their sum: " + two.calculateDifference(num));
		System.out.println("a number is an increasing number: " + three.checkNumber(num));
		System.out.println(" if the input is a power of two: " + four.checkNummber(num));
		
		
	}
}

class AssignmentOne {
	public int calculateSum(int num) {
		int sum = 0;
		while(num>0) {
			if((sum%3==0) || (num%5 == 0))
				sum += num;
			num--;
		}
		
		return sum;
	}
}
class AssignmentTwo {
	public int calculateDifference(int num) {
		int sum = 0, sumSquares = 0;
		
		while(num>0) {
			sumSquares += (num*num);
			sum += num--;
		}
		
		return (sumSquares) - (sum*sum);
	}
}
class AssignmentThree {
	public boolean checkNumber(int num) {
		int onesPlace = num%10, tensPlace = (num%100)/10;
		
		while(num/100 > 0) {
			
			if(tensPlace > onesPlace)
				return false;
				
			num = num/10;
			
			tensPlace = (num%100)/10;
			onesPlace = num%10;
		}
		if(tensPlace > onesPlace)
			return false;
		return true;
	}
}
class AssignmentFour {
	public boolean checkNummber(int num) {
		int rem = 0;
		while(rem == 0) {
			rem = num%2;
			num = num/2;
		}
		if(num != rem)
			return false;
		else 
			return true;
	}
}
