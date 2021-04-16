package lab5;

import java.util.Stack;

public class DailyTemperatures
{

	public static void main(String args[])
	{
		int[] temps = { 73, 74, 75, 71, 69, 72, 76, 73};
		int daysToWait[] = getDays(temps);
		for (int i = 0; i < daysToWait.length; i++)
		{
			System.out.println(daysToWait[i]);
		}
	}

	public static int[] getDays(int[] temps)
	{
		int[] days = new int[temps.length];
		Stack<Integer> stk = new Stack<Integer>();

		for (int i = 0; i < temps.length; i++)
		{

			while (!stk.isEmpty() && temps[i] > temps[stk.peek()])
			{
				int index = stk.pop();		
				days[index] = i-index;
			}
			stk.push(i);

		}

		return days;

	}
}
