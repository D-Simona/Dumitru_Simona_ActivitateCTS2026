package ro.ase.cts.program;

import ro.ase.cts.clase.Sticker;
import ro.ase.cts.clase.StickerPrototip;

public class Program {
    public static void main(String[] args) {
        StickerPrototip sticker = new Sticker(5, 6, "verde");
        StickerPrototip sticker1 = sticker.copiaza();
        ((Sticker)sticker1).setCuloare("roz");

        System.out.println(sticker1);

    }

}
