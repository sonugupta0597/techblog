/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pc
 */
public class NewClass {
    public static void main(String[] args) throws ParseException {
//        Date date =new Date();
//        System.out.println(date);
//        DateFormat datef=DateFormat.getDateInstance();
//        System.out.println(datef.format(date));
//        SimpleDateFormat s=new SimpleDateFormat("ZZ");
//        System.out.println(s.format(date));
//        System.out.println(date.getDay());
        
        String cDate="17-05-2020";

        SimpleDateFormat datef=new SimpleDateFormat("dd-MM-yy");
        
        Date date=datef.parse(cDate);
        
        System.out.println(date.getDay());
        
        
    }
}
