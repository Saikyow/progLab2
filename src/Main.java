import mypokemons.Carbink;
import mypokemons.Deino;
import mypokemons.Hydgion;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
       Battle b =  new Battle();
        Pokemon p1 = new Hydgion("gwgw", 1);
        Pokemon p2 = new Deino("Хcs,", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
