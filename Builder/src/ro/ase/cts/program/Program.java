package ro.ase.cts.program;

import ro.ase.cts.clase.Avatar;

public class Program {
    public static void main(String[] args) {
        Avatar avatar = new Avatar.Builder().setNume("Spider").build();
        System.out.println(avatar.toString());
    }
}
