package InterestingDays;

public class InterestingDays {

    public static void main(String[] args) {
        Day today = new Day();
        Day myDateOfBirth = new Day(2004, 4, 2);
        int daysSinceBirth = today.daysFrom(myDateOfBirth);
        System.out.println("Days I've been alive: " + daysSinceBirth);
        Day dayOfTest = new Day(2019, 5, 8);
        int daysUntilTest = today.daysFrom(dayOfTest);
        System.out.println("Days until test: " + daysUntilTest);
    }
}
