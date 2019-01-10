package utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Rocky on 2018-10-10.
 */
public class FindDates {
	


	public static void main(String[] args) throws Exception {
		Calendar cal = Calendar.getInstance();
		String start = "2012-02-05";
		String end = "2012-02-05";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dBegin = sdf.parse(start);
		Date dEnd = sdf.parse(end);
		List<Date> lDate = findDates(dBegin, dEnd);
		for (Date date : lDate) {
			System.out.println(sdf.format(date));
		}
		System.out.println("==========isSameDay===========");
		
	}
	
	/**
	 * 获取某段时间内的所有日期
	 * @param dBegin
	 * @param dEnd
	 * @return
	 */
	public static List<Date> findDates(Date dBegin, Date dEnd) {
		List<Date> lDate = new ArrayList<>();
		lDate.add(dBegin);
		Calendar calBegin = Calendar.getInstance();
		// 使用给定的 Date 设置此 Calendar 的时间
		calBegin.setTime(dBegin);
		Calendar calEnd = Calendar.getInstance();
		// 使用给定的 Date 设置此 Calendar 的时间
		calEnd.setTime(dEnd);
		// 测试此日期是否在指定日期之后
		while (dEnd.after(calBegin.getTime())) {
		//根据日历的规则，为给定的日历字段添加或减去指定的时间量
		calBegin.add(Calendar.DAY_OF_MONTH, 1);
	    lDate.add(calBegin.getTime());
		}
		return lDate;
	}
	

	/**
	 * 判断两个日期是否为同一天
	 * @param date1
	 * @param date2
	 * @return
	 */
	   public static boolean isSameDay(Date date1, Date date2) {
	        if(date1 != null && date2 != null) {
	            Calendar cal1 = Calendar.getInstance();
	            cal1.setTime(date1);
	            Calendar cal2 = Calendar.getInstance();
	            cal2.setTime(date2);
	            return isSameDay(cal1, cal2);
	        } else {
	            throw new IllegalArgumentException("The date must not be null");
	        }
	    }

	    public static boolean isSameDay(Calendar cal1, Calendar cal2) {
	        if(cal1 != null && cal2 != null) {
	            return cal1.get(0) == cal2.get(0) && cal1.get(1) == cal2.get(1) && cal1.get(6) == cal2.get(6);
	        } else {
	            throw new IllegalArgumentException("The date must not be null");
	        }
	    }
	
//    public final static int ERA = 0;
//
//    /**
//     * Field number for <code>get</code> and <code>set</code> indicating the
//     * year. This is a calendar-specific value; see subclass documentation.
//     */
//    public final static int YEAR = 1;
//
//
//
//    /**
//     * Field number for <code>get</code> and <code>set</code> indicating the day
//     * number within the current year.  The first day of the year has value 1.
//     */
//    public final static int DAY_OF_YEAR = 6; 


}
