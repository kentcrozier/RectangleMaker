import java.util.Scanner;

/**
 * RectangleMaker: Accepts width and height from user and displays asterix rectangle
 * <p>
 * @author Kent Crozier
 * @version 1
 * <p>
 * Assignment: Practice Code
 * Course: ADEV 1007
 * Section: 1
 * Date Created: 02-23-2016
 * Last Updated: 02-23-2016
 */
public class RectangleMaker
{
	public static void main(String[] args)
	{
		// Variable and object declarations
		Scanner keyboard = new Scanner(System.in);
		int width;
		int height;
		
		// Display program title to screen
		System.out.println("Rectangle Maker\n---------------");
		
		// Prompt user for width
		System.out.print("\nEnter width (e.g. 10): ");
		
		// Accept width from keyboard
		width = Integer.parseInt(keyboard.nextLine());
		
		// Prompt user for height
		System.out.print("Enter height (e.g. 5): ");
				
		// Accept height from keyboard
		height = Integer.parseInt(keyboard.nextLine());
		
		// Insert a blank line
		System.out.println("");		
		
		// Print rectangle
		for (int a = 0; a < height; a++)
		{
			// Print width part of rectangle
			for (int b = 0; b < width; b++)
			{
				// Print out individual asterix
				System.out.print("* ");
			}
			
			// After every line, set new line
			System.out.println("");
		}
		
		// Close scanner object
		keyboard.close();
	}
}
