package acg.architecture.view.loader;
/**
 * GlyphLoader
 * 
 * @author Tien Nguyen
 */

/**
 * Uses four stacks: Color, Vertex, Circle, Edge
 */
import java.util.Scanner;

public class GlyphLoader {
	
	// constructor
	public GlyphLoader(String filename)
	{
		Scanner file;
		
		try		// try catch block for valid file name
		{
			file = new Scanner ( new FileReader(filename));
			fill_lists(file);
			
			file.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error with file: Please try again");
			System.exit(1);
		}
	}
	
	// fills the lists
	private fill_lists(Scanner file)
	{
		String temp;
		String delims = "[,;]+";	// split string on , and ;
		String[] tokens;
		
		while(file.hasNext())
		{
			temp = file.next();
			
			tokens = temp.split(delims);
			
		}
	}

}
