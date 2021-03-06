/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 1/30/14
*          # Course Name: CITP 290
*          # Description:
*          ====================================================
*
*
*/

package pottst1.display;

import pottst1.data.Product;
import pottst1.data.*;

import java.math.BigDecimal;
import java.util.Scanner;
import java.lang.String;

/**
 * Describe what the class actually does here for the javadoc.
 *
 * @author pottst1
 */

public class SalesDisplay
{
	private Product[] invoiceList;
	private int invoiceSize;
	/**
	 * Describe what this method does for the javadoc.
	 */

	public void initialDisplay()
	{

		System.out.println("Sales Display\n");

		System.out.println("Would you like to do: Add, Remove, or Exit?: ");

		Scanner sc = new Scanner(System.in);
		String salesDisplayChoice = sc.next();

		if (salesDisplayChoice.equalsIgnoreCase("Add"))
		{
			System.out.println("You selected Add");
			addDisplay();
		}
		if (salesDisplayChoice.equalsIgnoreCase("Remove"))
		{
			System.out.println("You selected Remove");
			removeDisplay();
		}
		if (salesDisplayChoice.equalsIgnoreCase("Exit"))
		{
			System.out.println("You selected Exit.");
			System.exit(0);
		}
	}



	public Product[] addDisplay()
	{

		invoiceList = new Product[1000];
		invoiceSize = 0;

		boolean isValid = false;

		while (!isValid)
		{

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a UPC code: ");
			String upc = sc.nextLine();

			for (Product p : invoiceList)
			{
				if (p.getUpc().equals(upc))
				{
					isValid = true;

					invoiceList[0] = new Product();
					invoiceList[0].setUpc(upc);
					invoiceList[0].setDescription("Street Fighter");
					invoiceList[0].setPrice(new BigDecimal(40.00));
					invoiceList[0].setQuantity(1);
					invoiceSize++;
				}
				else
				{
					System.out.println("Error! The UPC code was not found.");
				}

			}
		}
		return invoiceList;
	}

	public static ProductList removeDisplay()
	{

		//Product product = new Product();
		Scanner sc = new Scanner(System.in);

		ProductList tempProdList = new ProductList();

		boolean isValid = false;

		//String upc = null;

		while (!isValid)
		{
			sc = new Scanner(System.in);
			System.out.print("Enter a UPC code: ");
			String upc = sc.nextLine();

			for (Product p : tempProdList.getProducts())
			{
				if (p.getUpc().equals(upc))
				{
					isValid = true;
					break;
				}
				else
				{
					System.out.println("Error! The UPC code was not found.");
				}

			}
		}
		return tempProdList;
	}
}




