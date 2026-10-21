class Time {
    int hours, minutes;

    Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    static Time add(Time t1, Time t2) {
        int totalMinutes = t1.minutes + t2.minutes;
        int totalHours = t1.hours + t2.hours + totalMinutes / 60;
        totalMinutes = totalMinutes % 60;
        return new Time(totalHours, totalMinutes);
    }

    public static void main(String[] args) {
        Time t1 = new Time(4, 45);
        Time t2 = new Time(3, 30);
        Time result = add(t1, t2);
        System.out.println("Time 1 = " + t1.hours + " hours " + t1.minutes + " minutes");
        System.out.println("Time 2 = " + t2.hours + " hours " + t2.minutes + " minutes");
        System.out.println("Result = " + result.hours + " hours " + result.minutes
                + " minutes");
    }
}
