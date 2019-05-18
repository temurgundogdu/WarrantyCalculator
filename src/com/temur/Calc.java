package com.temur;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calc {
    private String serialNumber;
    private int prodYear;
    private int prodWeek;
    private int warYear;

    public int getWarYear() {
        return warYear;
    }

    public void setWarYear(int warYear) {
        this.warYear = warYear;
    }

    public int getProdWeek() {
        return prodWeek;
    }

    public void setWeek(int week) {
        prodWeek = week;
    }

    public int getYear() {
        return prodYear;
    }

    public void setYear(int year) {
        prodYear = year;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int yearPicker(){
        setYear(Integer.parseInt(serialNumber.substring(5, 7)));
        return prodYear;
    }

    public int weekPicker(){
        setWeek(Integer.parseInt(serialNumber.substring(7, 9)));
        return prodWeek;
    }

    public void prodDate() {
        setYear(Integer.parseInt(serialNumber.substring(5, 7)));
        setWeek(Integer.parseInt(serialNumber.substring(7, 9)));
        SimpleDateFormat sdfProd = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calProd = Calendar.getInstance();
        calProd.set(Calendar.WEEK_OF_YEAR, prodWeek);
        calProd.set(Calendar.DAY_OF_WEEK, 2);
        calProd.set(Calendar.YEAR, prodYear + 2000);
        System.out.println("Production date: " + sdfProd.format(calProd.getTime()));
    }

    public void warDate() {
        SimpleDateFormat sdfWar = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calWar = Calendar.getInstance();
        calWar.set(Calendar.WEEK_OF_YEAR, prodWeek);
        calWar.set(Calendar.DAY_OF_WEEK, 2);
        calWar.set(Calendar.YEAR, prodYear + warYear + 2000);
        System.out.println("Warranty expiration date : " + sdfWar.format(calWar.getTime()));
    }
}
