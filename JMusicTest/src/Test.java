import jm.JMC;
import jm.music.data.*;
import jm.util.*;
 
public class Test implements JMC {
    public static void main(String[] args){
        System.out.println("Java works");
        Score s = new Score(new Part(new Phrase(new Note(C4, MINIM))));
        Write.midi(s, "Test.mid");
    }
}