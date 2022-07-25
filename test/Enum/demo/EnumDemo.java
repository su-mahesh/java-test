package demo;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class Test {
	Day day;

	// Constructor
	public Test(Day day) {
		this.day = day;
	}

	// Prints a line about Day using switch
	public void dayIsLike() {

		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}
}

enum Color {
	RED("RED"), BLUE("BLUE"), GREEN;

	// enum constructor called separately for each
	// constant
	private Color() {
		System.out.println("Constructor called for : " + this.toString());
	}
	private Color(String string) {
		System.out.println("Constructor called for : " + this.toString());
	}
	

	public void colorInfo() {
		System.out.println("Universal Color");
	}
}

public class EnumDemo {

	public static void main(String[] args) {

		Color c = Color.GREEN;
		c.colorInfo();
	}

}
