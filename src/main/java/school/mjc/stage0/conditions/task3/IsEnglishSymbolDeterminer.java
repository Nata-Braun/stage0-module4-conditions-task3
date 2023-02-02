package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int valueAscii= symbol;
        if ( (valueAscii>=65 && valueAscii <= 90) || (valueAscii>=97 && valueAscii<=122)){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
