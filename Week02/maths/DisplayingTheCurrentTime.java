package Practice.Exercises.Week02.maths;

public class DisplayingTheCurrentTime {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        long totalSeconds = currentTimeMillis / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}

