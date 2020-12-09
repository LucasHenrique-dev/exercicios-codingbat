package alarmClock;

public class AlarmClock {
    //A variável "day" representará os dias da semana, de modo que domingo = 0, segunda = 1, terça = 2..., sabendo disso,
    //retorne uma String que seguirá a seguinte lógica: se for dia de semana retorne "7:00", caso não "10:00", porém se
    //a variável "vacation" for true, nos dias de semana deve-se retornar "10:00", caso não "off".

    public String alarmClock(int day, boolean vacation) {
        if (!vacation && day!=0 && day!=6) return "7:00";
        else if (vacation && (day==0 || day==6)) return "off";
        return "10:00";
    }

}
