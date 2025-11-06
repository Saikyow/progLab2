import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
       Battle b =  new Battle();
        Pokemon p1 = new Hydgion("ркур", 1);
        Pokemon p2 = new Deino("Хcs,", 1);
        Pokemon p3 = new Carbink("grnjh", 1);
        Pokemon p4 = new Zweilous("53jh", 1);
        Pokemon p5 = new Phantump("62", 1);
        Pokemon p6 = new Hydgion("g72jh", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
