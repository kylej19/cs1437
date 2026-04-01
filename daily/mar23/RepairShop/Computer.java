// Author: Kyle Johnson

package RepairShop;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Computer {

	private String vendor; 
	private String device; 
	private int year; 
	private double cost;  

	// CONSTRUCTOR 
	public Computer(String vendor, String device, int year, double cost) { 
		this.vendor = vendor; 
		this.device = device; 
		this.year = year; 
		this.cost = cost; 
	}

       	// ACCESORS 
	public String getVendor() { 
		return vendor; 
	} 
	public String getDevice() { 
		return device; 
	} 
	public int getYear() { 
		return year; 
	} 
	public double getPrice() 
	{ 
		return cost; 
	} 
	public String toString() {
		return "vendor="+vendor+",device="+device+",year="+year+",cost="+cost+"  ";
	}

       	// MUTATORS 
	public void setVendor(String vendor) { 
		this.vendor = vendor; 
	} 
	public void setDevice(String device) { 
		this.device = device; 
	} 
	public void setYear(int year) { 
		this.year = year; 
	} 
	public void setPrice(int cost) { 
		this.cost = cost; 
	}
 
}
