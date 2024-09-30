package com.campusdual.classroom;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    protected Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public String getFormattedDate(Date formattedDate) {
        return new SimpleDateFormat("dd-MM-yyyy")
                .format(formattedDate);
    }

    @Override
    public Object getSpecificData() {
        return new StringBuilder()
                .append(getLocation())
                .append(getFormattedDate(getExpirationDate()))
                .toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}
