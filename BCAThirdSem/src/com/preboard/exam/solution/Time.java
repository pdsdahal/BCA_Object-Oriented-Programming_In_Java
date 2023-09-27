package com.preboard.exam.solution;

public class Time {
	
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public Time add(Time customTime) {
		
		int totalHour = this.hours + customTime.hours;
		int totalMinutes = this.minutes + customTime.minutes;
		int totalSeconds = this.seconds + customTime.seconds;

		if (totalSeconds >= 60) {
			totalMinutes = totalMinutes + totalSeconds / 60;
			totalSeconds = totalSeconds % 60;
		}

		if (totalMinutes >= 60) {
			totalHour = totalHour + totalMinutes / 60;
			totalMinutes = totalMinutes % 60;
		}

		if (totalHour >= 24) {
			totalHour = totalHour % 24;
		}

		return new Time(totalHour, totalMinutes, totalSeconds);
	}

	public Time subtract(Time customTime) {
		int totalHours = this.hours - customTime.hours;
		int totalMinutes = this.minutes - customTime.minutes;
		int totalSeconds = this.seconds - customTime.seconds;

		if (totalSeconds < 0) {
			totalMinutes = totalMinutes - 1;
			totalSeconds = totalSeconds + 60;
		}

		if (totalMinutes < 0) {
			totalHours = totalHours - 1;
			totalMinutes = totalMinutes + 60;
		}

		if (totalHours < 0) {
			totalHours = totalHours + 24;
		}

		return new Time(totalHours, totalMinutes, totalSeconds);
	}
	
	public String displayTime() {
		 return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

}
