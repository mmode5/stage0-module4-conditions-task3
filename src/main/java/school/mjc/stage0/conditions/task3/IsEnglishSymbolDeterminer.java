package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public static void isEnglishSymbol(char symbol) {
        int numRep = (int) symbol;
        if((numRep >= 65 && numRep <= 90) ||(numRep >= 97 && numRep <= 122) ){
            System.out.println("English");
        }else {
            System.out.println("Non English");
        }
    }
}
