package twoChar;

public class TwoChar {
    //Retorne uma String de tamanho 2, iniciando pelo índice indicado pelo parêmetro "index", o "lenght" da String dada
    //deverá ser de pelo menos 2. Caso o inedex seja grande demais ou pequeno demais, retorne as 2 primeiras letras.

    public String twoChar(String str, int index) {
        if (index <= 0 || index+2 > str.length()){
            index = 0;
        }
        return str.substring(index,index+2);
    }
}
