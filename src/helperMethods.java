import java.util.ArrayList;
import java.util.Date;


public class helperMethods {


	@SuppressWarnings("deprecation")
	public void waitForAlarms(ArrayList<Integer[]> alarms)
	{
		while(alarms.size() > 0)
		{
			Date dateTime = new Date();
			for(int x = 0; x < alarms.size(); x++)
			{
				if(dateTime.getHours() == alarms.get(x)[0])
				{
					if(dateTime.getMinutes() == alarms.get(x)[1])
					{
						System.out.println("The time is " + dateTime.toString() + ". An alarm has been triggered!");
						alarms.remove(x);
						break;
					}
				}
			
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


	public Integer[] stringToTime(String time)
	{
		String hrs = time.charAt(0) + "" + time.charAt(1);
		String min = time.charAt(3) + "" + time.charAt(4);
		Integer hrsAndMinutes[] = new Integer[2];
		hrsAndMinutes[0] = Integer.parseInt(hrs);
		hrsAndMinutes[1] = Integer.parseInt(min);
		return hrsAndMinutes;
	}
}
