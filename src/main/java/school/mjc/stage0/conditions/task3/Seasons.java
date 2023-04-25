package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        String season = "wrong number!";
        if (month == 12 || month >= 1 && month <= 2) {
            season = "Winter";
        } else if (month > 2 && month <=5) {
            season = "Spring";
        } else if (month > 5 && month <= 8) {
            season = "Summer";
        } else if (month > 8 && month <= 11) {
            season = "Autumn";
        }
        System.out.println(season);
    }
}
