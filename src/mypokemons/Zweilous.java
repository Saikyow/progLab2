package mypokemons;

import attacks.Bite;
import attacks.DoubleHit;
import attacks.ScaryFace;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zweilous extends Pokemon {
    public Zweilous(String name, int level) {
        super(name, level);
        super.setType(new Type[]{Type.DARK, Type.DRAGON});
        super.setStats(72.0F, 85.0F, 70.0F, 65.0F, 70.0F, 58.0F);
        Bite bite = new Bite(60.0F, 100.0F);
        ScaryFace scaryFace = new ScaryFace(0.0F, 100.0F);
        DoubleHit doubleHint = new DoubleHit(35.0F, 90.0F);
        super.setMove(new Move[]{bite, scaryFace, doubleHint});
    }
}
