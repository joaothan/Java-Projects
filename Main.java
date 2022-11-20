package p1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students = new String[] { "Paul", "Tabitha", "Elaine" };
		int[][] grades = new int[][] {
			{ 65, 100, 82, 97, 100, 75 },
			{ 99, 50, 100, 89, 71, 95 },
			{ 81, 85, 93, 99, 84, 85 }
		};
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Student " + i + ": ");
			int average = 0;
		for (int j = 0; j < grades[i].length; j++) {
				System.out.print(grades[i][j] + " ");
				average += grades[i][j];
		}
		average /= grades[i].length;
		System.out.println(". Average: " + average);
	}
}
}
