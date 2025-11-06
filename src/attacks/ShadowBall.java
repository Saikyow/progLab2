package attacks;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(double pow, double acc) {super(Type.GHOST, pow, acc);}
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2) {
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);

        }
    }
    protected String describe() {return "Использована атака ShadowBall";}
}
