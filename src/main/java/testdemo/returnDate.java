package testdemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Derscription TODO
 * @auther David
 * @date 2018-10-22 14:49
 * @Version 1.o
 */
public class returnDate {

    public static void main(String[] args) {
        System.out.println(getNow());
        System.out.println(getOld());
    }

    public static String getNow() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        return sdf.format(calendar.getTime());
    }
    public static String getOld() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2005,10,21);
        return sdf.format(calendar.getTime());
    }


}
