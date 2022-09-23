package net.codejava;

public class MSearch 
{
	public static void MatrixSearch(int[][] arr, int key)
	{
		int mSize = 3;
		for(int i = 0; i < mSize; i++)
		{
			for(int j = 0; j < mSize; j++)
			{
				if(arr[i][j] == key)
				{
					System.out.println(key + " is found at [" + i + "," + j + "] in the matrix");
				}
			}
		}
		return;
	}
}