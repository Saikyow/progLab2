package mypokemons;

import attacks.Growth;
import attacks.ShadowBall;
import attacks.ShadowClaw;
import attacks.Xscissors;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Trevenant extends Pokemon {
    public Trevenant(String name, int level) {
        super(name, level);
        super.setType(new Type[]{Type.GHOST, Type.GRASS});
        super.setStats(85.0F, 110.0F, 76.0F, 65.0F, 82.0F, 56.0F);
        Growth growth = new Growth(0.0F, 0.0F);
        ShadowClaw shadowClaw = new ShadowClaw(70.0F, 100.0F);
        ShadowBall shadowBall = new ShadowBall(80.0F, 100.0F);
        Xscissors xscissors = new Xscissors(80.0F, 100.0F);
        super.setMove(new Move[] {growth, shadowClaw, shadowBall, xscissors});
    }
}
