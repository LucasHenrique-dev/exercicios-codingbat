package sleepIn;

public class SleepIn {
    //Dormir quando NÃO for um dia de semana ou estando de férias

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }
}
