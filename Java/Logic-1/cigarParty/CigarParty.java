package cigarParty;

public class CigarParty {
    //Retorne true se o número de "cigars" estiver entre 40 e 60, inclusive, a menos que o atributo "isWeekend" seja true,
    //nesse caso não há limite superior.

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) return true;
        else return (cigars >= 40 && cigars <= 60);
    }
}
