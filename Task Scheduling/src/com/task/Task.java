/*
  file name:Task.java
  Created by:Dhiresh Bhoir
  Create Date:-19-10-2016
  Purpose:Program for Task Scheduling
*/
package com.task;

import java.util.*;

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max = 0;
		ArrayList<Schedule> sch = new ArrayList<Schedule>();
		for (int i = 0; i < n; i++) {
			int deadline = scanner.nextInt();
			int min = scanner.nextInt();
			Schedule schedule = new Schedule(deadline, min);
			int j = i - 1;
			while (j >= 0 && sch.get(j).deadline > schedule.deadline) {
				Schedule schedule1 = sch.get(j);
				schedule1.done += schedule.min;
				max = Math.max(max, schedule1.done - schedule1.deadline);
				j--;
			}
			sch.add(j + 1, schedule);
			if (j < 0)
				schedule.done = schedule.min;
			else
				schedule.done = sch.get(j).done + schedule.min;
			max = Math.max(max, schedule.done - schedule.deadline);
			System.out.println(max);
		}
	}
}