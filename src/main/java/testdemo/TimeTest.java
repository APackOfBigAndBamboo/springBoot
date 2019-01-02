package testdemo;

import java.util.*;

/**
 * @Derscription TODO
 * @author  David
 * @date 2018-10-23 11:46
 * @Version 1.o
 */
@SuppressWarnings({"ALL", "AlibabaClassMustHaveAuthor"})
public class TimeTest {
    public final static String DATE_OUTPUT_PATTERNS = "yyyy-MM-dd";

    public static void main(String[] args) {

        String ss="2018-11-13";
        String[] bb=ss.split("-");
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR)-1+"asd");
        System.out.println(Integer.parseInt(bb[0])+1);

    }
}
