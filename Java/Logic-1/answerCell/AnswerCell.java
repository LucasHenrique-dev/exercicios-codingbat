package answerCell;

public class AnswerCell {
    //Retorne false se "isMorning" for true e "isMom" for false ou se "isAsleep" for true, caso contrário retorne true.

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        return !isMorning || isMom;
    }
}
