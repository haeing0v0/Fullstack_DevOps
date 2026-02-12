package reader;

import java.io.FileReader;

public class FileReaderRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		
		try {
			fr = new FileReader("reader.txt");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
