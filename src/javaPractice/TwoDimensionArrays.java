package javaPractice;

public class TwoDimensionArrays {

	public static void main(String[] args) {
		String x[][]=new String[2][3];
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
				
		x[1][0] = "A";
		x[1][1] = "B";
		x[1][2] = "C";
		int row;
		int col;
		for( row=0; row < x.length; row++) {
			for(col=0; col < x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}	
	}
}
