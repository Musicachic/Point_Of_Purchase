package pottst1.display;

/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/3/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

import pottst1.data.Product;
import pottst1.display.SalesDisplay;

import java.util.Arrays;

public class InvoiceDisplay
{
	public static void add()
	{

	String upc = SalesDisplay.addDisplay();
	Product[] arrayProducts = new Product[Integer.parseInt(upc)];

	//arrayProducts[i] = SalesDisplay.addDisplay();


		Arrays.sort(arrayProducts);

		for (Product arrayProduct : arrayProducts)
		{
			int i = 0;
			System.out.println(arrayProducts[i].getUpc());
		}
	}

}
