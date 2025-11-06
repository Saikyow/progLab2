package mypokemons;

import attacks.Bite;
import attacks.DoubleHit;
import attacks.ScaryFace;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hydgion extends Pokemon {
    public Hydgion(String name, int level) {
        super(name, level);
        super.setType(new Type[] {Type.DRAGON, Type.DARK});
        super.setStats(92.0F, 105.0F, 90.0F, 125.0F, 90.0F, 98.0F);
        Bite bite = new Bite(60.0F, 1000.0F);
        ScaryFace scaryFace = new ScaryFace(0.0F, 100.0F);
        DoubleHit doubleHit = new DoubleHit(35.0F, 90.0F);
        ScaryFace scaryFace2 = new ScaryFace(0.0F, 100.0F);
        super.setMove(new Move[]{bite, scaryFace, doubleHit,  scaryFace2});
    }
}
