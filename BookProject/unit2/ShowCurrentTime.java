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
//����������־��뱱��ʱ�仹��8��Сʱ��������Ϊ�������ʹ�õ�ʱ�����Ը�����������̨��ʱ��Ϊ��׼�ģ�
//����������ϣ���������ʱ���ǲ�ͬ�ġ���ʵ�ʲ����У���ʱ�����л��֣��ҹ����ñ������ڵĶ�����ʱ�䡣
//��ҿ��ܻ���ĳЩ�ط�������������ʱ�䣨GMT+8����������д����
//�����˵�ڸ�������ʱ�������Ҫ��8Сʱ�����������ճ�ʹ�õı���ʱ�䡣