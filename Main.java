public class Main {
    public static void main(String[] args) {

        System.out.println(whatMonthIsDay(31));
    }

    public static int daysBefore(int day,Month month){
        int daysBefore = day-1,monthsBefore;
        monthsBefore=month.ordinal();
        for (int i = 0; i < monthsBefore; i++) {
            daysBefore+=Month.values()[i].getDays();
        }
        return daysBefore;
    }

    public static Month whatMonthIsDay(int day){
        int days=0;
        for (int i = 0; i < 12; i++) {
            days+=Month.values()[i].getDays();
            if (days>=day)
                return Month.values()[i];
        }
        return Month.DECEMBER;
    }
}
