package mypokemons;

import attacks.Growth;
import attacks.RockSlide;
import attacks.ShadowBall;
import attacks.ShadowClaw;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Phantump extends Pokemon {
    public Phantump(String name, int level) {
        super(name, level);
        super.setType(new Type[]{Type.GHOST, Type.GRASS});
        super.setStats(43.0F,70.0F, 48.0F, 50.0F, 60.0F, 38.0F);
        Growth growth = new Growth(0.0F, 0.0F);
        ShadowClaw shadowClaw = new ShadowClaw(70.0F, 100.0F);
        ShadowBall shadowBall = new ShadowBall(80.0F, 100.0F);
        super.setMove(new Move[] {shadowBall, growth, shadowClaw});
    }
}
