package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Growth extends StatusMove {
    public Growth(double pow, double acc) {super(Type.NORMAL, pow, acc);}

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.sleep(p);
    }
    protected String describe() {return "Использована атака Growth";}
}
