package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        var SECONDS_IN_MINUTE = 60;
        var seconds = minutes * SECONDS_IN_MINUTE;
        System.out.println(seconds);
    }
}
