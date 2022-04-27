	//Author: Divine Iloh
	//BINS 5312
	//Date: 04/10/2022

package DemoSalesPerson;

import SalesPerson.SalesPerson;
public class DemoSalesPerson {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//define list variable for our salesPerson class 
		SalesPerson [] salesPeople = new SalesPerson[6];
		double sales = 0;
		int idNum = 1000;
		
		
		//use for loop to assign values to index of list created
		for (int i = 0; i < salesPeople.length; i++)
		{
			sales = (sales + 10000);
			idNum = (idNum + 1);
			salesPeople[i] = new SalesPerson(idNum, sales);
		}
		
		//display output using the get method
		System.out.println("Sales Person ID and Sales Amount");
		for (int i = 0; i < salesPeople.length; i++)
		{
			System.out.println ("Sales ID: " + salesPeople[i].getIDNumber() + 
					"	Sales Amount: " + salesPeople[i].getSalesAmount());
		}
		
		
		
	}

}
