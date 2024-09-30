package com.campusdual.classroom;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise15 {

	public static void main(String[] args) {
		FreshMerchandise fm = new FreshMerchandise("Manzanas", "001-9", "Frutería de ayer S.L.", 8, "C", "114D", 53,
				Calendar.getInstance().getTime());
		fm.printSpecificData();
		System.out.println(fm.getLocation());
	}

}
