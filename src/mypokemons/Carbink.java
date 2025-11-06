package mypokemons;

import attacks.DoubleTeam;
import attacks.Facade;
import attacks.RockSlide;
import attacks.Swagger;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Carbink extends Pokemon {
    public Carbink(String name, int level) {
        super(name, level);
        super.setType(new Type[]{Type.ROCK,  Type.FAIRY});
        super.setStats(50.0F, 50.0F, 150.0F, 50.0F, 150.0F, 50.0F);
        Facade facade = new Facade(70.0F, 100.0F);
        Swagger swagger = new Swagger(0.0F, 85.0F);
        DoubleTeam doubleTeam = new DoubleTeam(0.0F, 0.0F);
        RockSlide rockSlide = new RockSlide(75.0F, 90.0F);
        super.setMove(new Move[] {swagger, doubleTeam, rockSlide});
    }
}
