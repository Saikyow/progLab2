package mypokemons;

import attacks.Bite;
import attacks.ScaryFace;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Deino extends Pokemon {
    public Deino(String name, int level) {
        super(name, level);
        super.setType(new Type[]{Type.DRAGON, Type.DARK});
        super.setStats(52.0F, 65.0F, 50.0F, 45.0F, 50.0F, 38.0F);
        Bite bite = new Bite(60.0F,100.0F);
        ScaryFace scaryFace = new ScaryFace(0.0F, 100.0F);
        super.setMove(new Move[] {bite, scaryFace});
    }
}
