package attacks;

import ru.ifmo.se.pokemon.*;

public class ScaryFace extends StatusMove {
    public ScaryFace(double pow, double acc) {super(Type.NORMAL, pow, acc);}
    protected void applyOppEffect(Pokemon p) {
        p.setMod(Stat.SPEED, -2);
    }
    protected String describe(){return "Использована атака ScaryFace";}
}
