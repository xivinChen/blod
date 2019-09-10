package com.blod.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	public static String dateToString(Date date,String format) {
		String result=null;
		 SimpleDateFormat sdf=new SimpleDateFormat(format);
		 result=sdf.format(date);
		 return result;
	}

	public static Date formatDate(String date,String format) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.parse(date);
	}
	
	public static Date dateformatDate(Date date,String format) throws ParseException {
		String result=null;
		 SimpleDateFormat sdf=new SimpleDateFormat(format);
		 result=sdf.format(date);
		 return sdf.parse(result);
	}

}
