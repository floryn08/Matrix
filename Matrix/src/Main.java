

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		ReadMatrix readMatrix = new ReadMatrix("array.txt");

		WorkMatrix workSquare = new WorkMatrix(readMatrix.getMatrix());

		PrintWriter writer = new PrintWriter("Matrix/src/out.txt", "UTF-8");
		
		writer.print(readMatrix.toString());
		writer.println("Elementul maxim din matrice= "+workSquare.MaxMatrix());
		writer.println("Elementul minim din matrice= "+workSquare.MinMatrix());
		writer.println("Numarul de elemente pare= "+workSquare.Pare());
		writer.println("elementele pare="+workSquare.AfisPare());
		writer.println("Numarul de elemente impare= "+workSquare.Impare());
		writer.println("Elementele impare= "+workSquare.AfisImpare());
		writer.println("Numarul de patrate perfecte= "+workSquare.PatratPerf());
		
		writer.println("Suma matrice= "+workSquare.SumaMatrix());
		writer.println("ok");
		writer.println();
		writer.close();
	}
}
