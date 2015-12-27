
import java.lang.reflect.Array;
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

	public int[] AfisPare()  //nu e gata, need more time
	{
				
		int[] array=new int[99];
		for(int w=0;w<array.length;w++)
		for (int i = 0; i < matrix.length; i++) 
		{			
			for (int j = 0; j < matrix.length; j++) 
			{			
					if(matrix[i][j]%2==0)
					array[w]=matrix[i][j];
					
			}
		}
		return array;
		
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
	
	public int[] AfisImpare()
	{
		
		int[] array=new int[99];
		for(int w=0;w<array.length;w++)
		for (int i = 0; i < matrix.length; i++) 
		{			
			for (int j = 0; j < matrix.length; j++) 
			{			
					if(matrix[i][j]%2==1)
					array[w]=matrix[i][j];
					
			}
		}
		return array;
	}
	
	public int PatratPerf()
	{
		
		return 0;
		
	}
	
}
