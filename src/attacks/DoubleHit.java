package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DoubleHit extends PhysicalMove {
    public DoubleHit(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
        p.setMod(Stat.HP, (int) Math.round(damage));

    }
    protected String describe(){return "Использована атака DoubleHit";}
}
