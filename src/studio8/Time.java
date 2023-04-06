package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean military;
	
/**
 * 
 * @param hour
 * @param minute
 * @param military
 */
	
	public Time(int hour, int minute, boolean military) {
		this.hour = hour;
		this.minute = minute;
		this.military = military;
	}


	public String toString() {
		if (military) {
		 return hour + ":" + minute;
		}
		if (hour>12) {
			 return (hour -12) + ":" + minute;
		}
		else {
			 return hour + ":" + minute;
		}
	
	 }
	 
	public static void main(String[] args) {
		Time time = new Time(2,51,true);
		Time newTime = new Time(2,51,true);
				System.out.println(time);
				System.out.println(newTime);
				
			if(time.equals(newTime)) {
				System.out.println(true); 
			}
    }


	@Override
	public int hashCode() {
		return Objects.hash(hour, military, minute);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && military == other.military && minute == other.minute;
	}
	

}