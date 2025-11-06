package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade  extends PhysicalMove {
    public Facade(double pow, double acc) {super(Type.NORMAL, pow, acc);}

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon deff) {
        double baseDamage = super.calcBaseDamage(att, deff);
        Status con = att.getCondition();

        boolean hasStatus = con == Status.BURN || con == Status.PARALYZE || con == Status.POISON;
        if (hasStatus){
            baseDamage *= (double) 2.0F;
            System.out.println("Увеличена атака Facade в 2 раза");
        }
        return baseDamage;
    }
    protected String describe(){return "Использована атака Facade";}


}
