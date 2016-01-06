

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class Main 
{

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException 
	{

		ReadMatrix readMatrix = new ReadMatrix("array.txt");

		WorkMatrix workSquare = new WorkMatrix(readMatrix.getMatrix());

		PrintWriter writer = new PrintWriter("Matrix/src/out.txt", "UTF-8");
		
		
		
		int[][] matrix = readMatrix.getMatrix();
		writer.print(readMatrix.toString(matrix));
		writer.println();
		writer.println();
		writer.println();
		writer.println();
		writer.println("Elementul maxim din matrice= "+workSquare.MaxMatrix());
		writer.println("Elementul minim din matrice= "+workSquare.MinMatrix());
		writer.println("Numarul de elemente pare= "+workSquare.Pare());
		
		writer.print("Numerele pare : ");
		for (int i = 0; i < workSquare.AfisPare(matrix).length; i++) 
		{
			writer.print(workSquare.AfisPare(matrix)[i] + " ");
		}
		writer.println();
		
		writer.println("Numarul de elemente impare= "+workSquare.Impare());	
		
		writer.print("Numerele impare : ");
		for (int i = 0; i < workSquare.AfisImpare(matrix).length; i++) 
		{
			writer.print(workSquare.AfisImpare(matrix)[i] + " ");
		}
		writer.println();
		
		writer.println("Numarul de patrate perfecte= "+workSquare.PatratPerf());
		
		writer.print("Patrate perfecte : ");
		for (int i = 0; i < workSquare.AfisPatratPerf(matrix).length; i++) 
		{
			writer.print(workSquare.AfisPatratPerf(matrix)[i] + " ");
		}
		writer.println();
		
		writer.println("Numarul de elemente prime= "+workSquare.Prim());
		
		writer.print("Numere prime : ");
		for (int i = 0; i < workSquare.AfisPrim(matrix).length; i++) 
		{
			writer.print(workSquare.AfisPrim(matrix)[i] + " ");
		}
		writer.println();writer.println();writer.println();
		
		writer.println("Sume:");
		writer.println("	>Suma matrice= "+workSquare.SumaMatrix());
		writer.println("	>Suma pare= "+workSquare.SumaPare());
		writer.println("	>Suma impare= "+workSquare.SumaImpare());
		writer.println("	>Suma prime= "+workSquare.SumaPrime());
		writer.println("	>Suma patrate= "+workSquare.SumaPatrate());
		writer.println();
		writer.println("Daca matricea este patratica: ");
		writer.println("	>Suma elementelor de pe diagonala principala= "+workSquare.DiagPrinc());
		writer.println("	>Suma elementelor de pe diagonala secundara= "+workSquare.DiagSec());
		writer.println("	>Suma elementelor de deasupra dig principale= "+workSquare.SumaElDiagP());
		writer.println("	>"+workSquare.TestDiag());
		writer.println();
		
		
		writer.print("Linia ceruta= ");
		int []temp = workSquare.AfisLine(matrix);
		for(int i=0; i<temp.length; i++)
		{
			writer.print(temp[i]+" ");
		}
		
		writer.println();
		writer.print("Coloana ceruta= ");
		int []temp2 = workSquare.AfisCol(matrix);
		for(int i=0; i<temp2.length; i++)
		{
			writer.print(temp2[i]+" ");
		}

		writer.println();
		
		
		writer.println(workSquare.SumLin());
		writer.println(workSquare.SumCol());
		writer.println();writer.println();
		int [][] temp3 = workSquare.AfisMatrix2(matrix);
		writer.print(readMatrix.toString(temp3));
//		writer.println(readMatrix.toString(temp3));

		writer.println();
		writer.println("ok");
		writer.println();
		writer.close();
		
	}
}
