package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    protected void applyOppEffects(Pokemon self) {
        self.setMod(Stat.EVASION, 1);
    }

    protected String describe() {
        return "Использована атака Double Team";
    }
}

