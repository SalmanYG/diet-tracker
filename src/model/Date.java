package model;

import java.io.Serializable;

public class Date extends java.util.Date implements Serializable {

	private int year;
	private int month;
	private int day;
	public Date() {
		year = super.getYear();
		month = super.getMonth();
		day = super.getDay();
	}
	
	public String toString() {
		return day + "/" + month + "/" + year;
	}
	
	
}
