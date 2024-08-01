package enums;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    private final boolean isWeekday;

    public String dayType(){
        return isWeekday ? "Weekday": "Weekend";
    }
}
