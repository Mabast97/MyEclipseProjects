
public class Time2 {

	private int hour;
	private int minute;
	private int second;
	
	public Time2()
	{
		this(0, 0, 0);
	}
	
	public Time2(int h)
	{
		this(h, 0, 0);
	}
	
	public Time2(int h, int m)
	{
		this(h, m, 0);
	}
	
	public Time2(Time2 t)
	{
		 this( t.getHour(), t.getMinute(), t.getSecond() );
	}
	
	public Time2(int h, int m, int s)
	{
		setTime(h, m, s);
	}
	
	public void setTime(int hour, int m, int s)
	{
		setHour(hour);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h)
	{
		hour = ( (h>=0 && h<24)? h : 0) ;
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public void setMinute(int m)
	{
		minute = ( (m>=0 && m<60)? m : 0 );
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public void setSecond(int s)
	{
		second = ( (s>=0 && s<60)? s : 0 );
	}
	
	public int getSecond()
	{
		return second;
	}
	
	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public int totalSeconds(Time2 time)
	{
		int total = 0;
		total += time.second + ( time.minute * 60 ) + ( time.hour * 3600 );
		
		return total;
	}
	
	public String toString()
	{
		return String.format("%d:%02d:%02d %s", (getHour()==0 || getHour()==12)? 12 : getHour()%12, getMinute(), getSecond(), (getHour()<12)? "A.M":"PM");
	}
	
	public void incrementMinute(int incMin)
	{
		minute += incMin;
		if (minute >= 60)
		{
			hour++;
			minute = minute%60;
		}
	}
	
	public void incrementHour(int incHour)
	{
		hour += incHour;
		if (hour >= 24)
		{
			hour %= 24;
		}
	}
	
	
	

} // end of class
