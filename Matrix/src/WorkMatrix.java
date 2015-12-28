

import java.util.Arrays;

public class WorkMatrix 
{
	 
	
	private int[][] matrix;
	

	public WorkMatrix(int[][] matrix) {
		this.setMatrix(matrix);
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	int[] addElement(int[] org, int added) 
	{
		int[] result = Arrays.copyOf(org, org.length + 1);
		result[org.length] = added;
		return result;
	}

	public int SumaMatrix()
	{
		int s = 0;
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{
				s=s+matrix[i][j];
			}
		}
		return s;
	}
	
	public int SumaPare()
	{
		int s = 0;
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{				
					if(matrix[i][j]%2==0)
						s+=matrix[i][j];				
			}
		}
		return s;
	}

	public int SumaImpare()
	{
		int s = 0;
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{				
					if(matrix[i][j]%2!=0)
						s+=matrix[i][j];				
			}
		}
		return s;
	}

	public int SumaPrime()
	{
		int s=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				for(int k=2;4*k<matrix.length;k++)
					if(matrix[i][j]%k==0)
						s+=matrix[i][j];
			}
		}
		
		return s;		
	}

	public int SumaPatrate()
	{
		double a=0;
		int s=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				a=Math.sqrt(matrix[i][j]);
				if(matrix[i][j]/a==a)
						s+=matrix[i][j];
			}
		}
		
		return s;		
	}
	
	public int MaxMatrix()
	{
		int max=matrix[0][0];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0; j<matrix.length;j++)
			{
				if(max<matrix[i][j])
					max=matrix[i][j];
			}
		}
		return max;
	}
	
	
	public int MinMatrix()
	{
		int min=matrix[0][0];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0; j<matrix.length;j++)
			{
				if(min>matrix[i][j])
					min=matrix[i][j];
			}
		}
		return min;
	}

	public int Pare()
	{
		int counter=0;
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{				
					if(matrix[i][j]%2==0)
						counter++;				
			}
		}
		return counter;
	}

	public int Impare()
	{
		int counter=0;
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{				
					if(matrix[i][j]%2==1)
						counter++;				
			}
		}
		return counter;
	}
	
	public int[] AfisImpare(int[][] matrix)					//afiseaza elementele impare
	{
		int[] temp = new int[0];
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{
				if (matrix[i][j] % 2 != 0) {
					temp = addElement(temp, matrix[i][j]);
				}
			}
		}
		return temp;
	}
	
	public int[] AfisPare(int[][] matrix)					//afiseaza elementele pare
	{
		int[] temp = new int[0];
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{
				if (matrix[i][j] % 2 == 0) {
					temp = addElement(temp, matrix[i][j]);
				}
			}
		}
		return temp;
	}
	
	
	public double PatratPerf()
	{
		double a = 0,contor = 0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				a=Math.sqrt(matrix[i][j]);
				if(matrix[i][j]/a==a)
					contor++;
			}
		}
		
		return contor;
	}
	
	public int[] AfisPatratPerf(int[][] matrix)
	{
		double a=0;
		int[] temp = new int[0];
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{
				a=Math.sqrt(matrix[i][j]);
				if(matrix[i][j]/a==a) 
				{
					temp = addElement(temp, matrix[i][j]);
				}
			}
		}
		return temp;
	}
	
	public int Prim()
	{
		int contor=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				for(int k=2;4*k<matrix.length;k++)
					if(matrix[i][j]%k==0)
						contor++;
			}
		}
		
		return contor;		
	}
	
	public int[] AfisPrim(int[][] matrix)
	{
		
		int[] temp = new int[0];
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{
				for(int k=2;4*k<matrix.length;k++)
					if(matrix[i][j]%k==0)
				{
					temp = addElement(temp, matrix[i][j]);
				}
			}
		}
		return temp;
	}
	
}
