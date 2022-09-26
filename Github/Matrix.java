package com.Bonus;

import java.util.Scanner;

/*
 * Create a class called ‘Matrix’ containing constructor that initializes the number of rows
and number of columns of a new Matrix object. The Matrix class has the following
information:
5.1. Number of rows of matrix
5.2. Number of columns of matrix
5.3. Elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
1. Get the number of rows
2. Get the number of columns
3. Set the elements of the matrix at given position (i, j)
4. adding two matrices. If the matrices are not addable, “Matrices cannot be added” will be displayed.
5. multiplying the two matrices
 */
class TwoD
{
	int matrix1 [][] ;
	int matrix2[][] ;
	int add[][];
	int row,column,row2,column2;
	
	TwoD(int r,int c,int r2,int c2,int[][] m1,int[][] m2,int[][] a)
	{
		matrix1= m1;
		matrix2 = m2;
		row = r;
		column = c;
		row2 = r2;
		column2 = c2;	
		add=a;
	}
	void mat1()
	{
		System.out.println("Elements of first matrix are: ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
				System.out.println();
				}
		}
		
	void mat2()
	{
		System.out.println("Elements of Second matrix are: ");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<column2;j++)
			{
				System.out.print(matrix2[i][j]+" ");
			}
				System.out.println();
			}
		}
	void addMat()
	{
		
		if(row==row2 && column==column2)
		{
			for(int i =0;i<row;i++)
			{
				for(int j=0;j<column2;j++)
				{
					for(int k=0;k<column;k++)
					{
						add[i][j]=matrix1[i][j] + matrix2[i][j];
					}
				}
			}
			System.out.println("The addtion of matrix is");
			{
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<column2;j++)
					{
						System.out.print(add[i][j]+" ");
					}
					System.out.println(" ");
				}
			}
		}
		else
		{
			System.out.println("Matrices cannot be added");
		}
		
	}
}
public class Matrix {

	public static void main(String[] args) {
		int i,j;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the row of matrix1: ");
		int r=in.nextInt();
		System.out.println("Enter the column of matrix1: ");
		int c=in.nextInt();
		int m1 [][]=new int[r][c];
		System.out.println("Enter the element of matrix 1:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				m1[i][j]=in.nextInt();
			}
		}
		System.out.println("Enter the row of matrix2: ");
		int r2=in.nextInt();
		System.out.println("Enter the column of matrix2: ");
		int c2=in.nextInt();
		int m2[][]=new int[r2][c2];
		System.out.println("Enter the element of matrix 2:");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				m2[i][j]=in.nextInt();
			}
		}
		int a[][]=new int[r2][c2];
		
		
		TwoD obj = new TwoD(r,c,r2,c2,m1,m2,a);
		obj.mat1();
		obj.mat2();
		obj.addMat();

	}

}
