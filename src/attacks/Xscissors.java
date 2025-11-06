package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Xscissors extends PhysicalMove {
    public Xscissors(double pow, double acc) {super(Type.BUG, pow, acc);}
    protected String describe(){return "Использована атака Xscissors";}
}
