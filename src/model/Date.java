package model;

import java.io.Serializable;
import java.util.Calendar;

public class Date implements Serializable {

	private int year;
	private int month;
	private int day;

	public Date() {

		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH) + 1;
		day = calendar.get(Calendar.DATE);
	}

	public int getDay()
	{
		return day;
	}

	public int getMonth()
	{
		return month;
	}

	public int getYear()
	{
		return year;
	}

	public String toString() {
		return day + "/" + month + "/" + year;
	}


}
