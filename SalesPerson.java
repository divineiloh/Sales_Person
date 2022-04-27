	//Author: Divine Iloh
	//BINS 5312
	//Date: 04/10/2022

package SalesPerson;

public class SalesPerson {

	//data fields
	private int idNumber;
	private double salesAmount;
	
	//set methods or mutator methods
	
	public void setIDNumber (int ID)
	{
		idNumber = ID;
	}
	
	public void setSalesAmount (double amount)
	{
		salesAmount = amount;
	}
	
	//get methods or accessor methods
	
	public int getIDNumber ()
	{
		return idNumber;
	}
	
	public double getSalesAmount ()
	{
		return salesAmount;
	}
	
	//Constructor for the SalesPerson class
	
	public SalesPerson (int id, double salesAmt)
	{
		idNumber = id;
		salesAmount = salesAmt;
	}
	
	
}
