import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;


public class main {


	public static void main(String[] args)
	{
		Date dateTime = new Date();
		helperMethods methods = new helperMethods();
		System.out.println("According to your system the current Date/Time is: " + dateTime.toString());

	
		int alarmCnt = 0;
		String alarmTime;
		ArrayList<Integer[]> alarms = new ArrayList<Integer[]>();
		Scanner input = new Scanner(System.in);
		System.out.println("How many alarms would you like to set?");
		alarmCnt = input.nextInt();
	
		for(int x = 0; x < alarmCnt; x++)
		{
			System.out.println("Enter the time for alarm" + x + " in hh:mm format(using 24hr format instead of AM/PM):");
			alarmTime = input.next();
			alarms.add(methods.stringToTime(alarmTime));
		}

	
		methods.waitForAlarms(alarms);
	}
}
