package unit2;

public class ShowCurrentTime {
	public static void main(String[] args) {
		//Obtain the total milliseconds since midnight,Jan 1,1970
		long totalMilliseconds = System.currentTimeMillis();
		
		//Obtain the total seconds since midnight,Jan 1,1970
		long totalSeconds = totalMilliseconds / 1000;
		
		//Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		//Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		//Compute the current hour
		long currentHour = totalHours % 24;
		
		//Display results
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
	}
}

//Current time is 11:15:48
//计算出来发现距离北京时间还差8个小时，这是因为世界各国使用的时间是以格林尼治天文台的时间为基准的，
//在这个基础上，各地区的时间是不同的。在实际操作中，以时区进行划分，我国采用北京所在的东八区时间。
//大家可能会在某些地方见到过“北京时间（GMT+8）”这样的写法，
//这就是说在格林尼治时间基础上要加8小时，才是我们日常使用的北京时间。