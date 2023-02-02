package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int valAscii= character;
        if ( (valAscii>=65 && valAscii <= 90) || (valAscii>=97 && valAscii<=122)){
            if ( (valAscii==65 || valAscii == 69) || valAscii>=73 || valAscii==79 || valAscii==85 || valAscii==89 ||valAscii==97 || valAscii == 101 || valAscii>=105 || valAscii==111 || valAscii==117 || valAscii==121 ){
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }else {
            System.out.println("wrong alphabet!");
        }

    }

}
