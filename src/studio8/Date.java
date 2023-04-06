package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

private int month;
private int day;
private int year;
private boolean holiday;
/**
 * 
 * @param month
 * @param day
 * @param year
 * @param holiday
 */
    public Date(int month, int day, int year, boolean holiday) {
	this.month = month;
	this.day = day;
	this.year = year;
	this.holiday = holiday;
}

    public String toString() {
    	if (holiday) {
    		return month + "/" + day + "/" + year + " It's a holiday!";
    	}
    	return month + "/" + day + "/" + year;
    }
    
	public static void main(String[] args) {
		Date date1 = new Date(7,4,2008,true);
		Date date2 = new Date(7,4,2002,false);
		Date date3 = new Date(9,11,2006, true);
		Date date4 = new Date(6,29,2004, false);
		Date date5 = new Date(12, 30, 2003, false);
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(date1);
		list.add(date2);
		list.add(date3);
		list.add(date4);
		list.add(date5);
		
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(date1);
		set.add(date2);
		set.add(date3);
		set.add(date4);
		set.add(date5);
		
		System.out.println(set);
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month;
	}

	

}
