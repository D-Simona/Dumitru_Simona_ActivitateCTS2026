package ro.ase.cts.clase;

import java.util.ArrayList;

public class Structura extends ANod {
    //nod non-frunza/Composite din Diagrama GoF
    private ArrayList<ANod> structura = new ArrayList<>(); //lista fiilor
    private String numeStructura; //eticheta(label)

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    //aceste metode arunca exceptiile pt ca nu sunt metode specifice nodului structura ci ale nodului frunza
    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException();
    }

    //o implementare recursiva care permite afisarea label ului curent + cere afisare pt fiecare nod fiu
    @Override
    public String getInfo() {
        String info = " ";
        info = this.numeStructura + "\n";
        for(ANod n: structura){
            info +=" " + n.getInfo();
            info += "\n";
        }
        return info;
    }

    @Override
    public void adaugaNod(ANod elemStructura) {
        structura.add(elemStructura);
    }

    @Override
    public void eliminationNod(ANod elemStructura) {
        structura.remove(elemStructura);
    }

    @Override
    public ANod getNod(int i) {
        return structura.get(i);
    }
}
