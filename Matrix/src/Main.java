

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		ReadMatrix readMatrix = new ReadMatrix("array.txt");

		WorkMatrix workSquare = new WorkMatrix(readMatrix.getMatrix());

		PrintWriter writer = new PrintWriter("Matrix/src/out.txt", "UTF-8");
		
		writer.print(readMatrix.toString());
		writer.println("Suma matrice= "+workSquare.SumaMatrix());
		writer.println("ok");
		writer.close();
	}
}
