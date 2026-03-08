package program;

import factory.FabricaPersonal;
import factory.TipPersonal;
import personal.PersonalSpital;

public class Program {
    public static void main(String[] args) {
        FabricaPersonal fabrica = FabricaPersonal.getInstanta();
        PersonalSpital brancardier = fabrica.getPersonalSpital(TipPersonal.Brancardier, "Ion");
        PersonalSpital asistent = fabrica.getPersonalSpital(TipPersonal.Asistent, "Maria");
        PersonalSpital medic = fabrica.getPersonalSpital(TipPersonal.Medic, "Gheorghe");

        System.out.println(brancardier.toString());
        System.out.println(asistent.toString());
        System.out.println(medic.toString());

    }
}
