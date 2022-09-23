package net.codejava;

public class Main 
{
	public static void main(String[] args) 
	{
		int[][] matrixArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int mKey = 5;
		
		System.out.println("the value at [1,0] in the matrix is " + matrixArray [1][0]);
		
		MSearch.MatrixSearch(matrixArray, mKey);
	}
}