package acg.architecture.view.loader;

import java.util.Scanner;

public class GlyphLoader {
	
	public GlyphLoader(String filename)
	{
		Scanner file;
		
		try
		{
			file = new Scanner ( new FileReader(filename));
			
			file.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error with file: Please try again");
			System.exit(1);
		}
	}

}
