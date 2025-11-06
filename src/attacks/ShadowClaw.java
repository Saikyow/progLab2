package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw(double pow, double acc) {super(Type.GHOST, pow, acc);}

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon deff) {
        if (Math.random() <= 0.25) {
            System.out.println("Критический удар ShadowClaw");
            return 1.5;
        }
        return 1.0;
    }
        protected String describe() {return "Использована атакака ShadowClaw";}



}
