package cts.clase;

public class Sticker implements StickerPrototip {
    private float latime;
    private float lungime;
    private String culoare;

    public void setLatime(float latime) {
        this.latime = latime;
    }

    public void setLungime(float lungime) {
        this.lungime = lungime;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Sticker(float latime, float lungime, String culoare) {
        if(latime>2.5 && latime<5.5){
            this.latime = latime;

        }else {
            this.latime=0;
        }
        if(lungime> 5 && latime < 8.5){
            this.lungime = lungime;

        }else{
            this.lungime = 0;
        }
        if(culoare == "rosu" || culoare == "verde" || culoare=="albastru"){
            this.culoare = culoare;
        }else {
            this.culoare="alb";
        }

    }

    private Sticker()
    {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("latime=").append(latime);
        sb.append(", lungime=").append(lungime);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public StickerPrototip copiaza() {
        Sticker sticker = new Sticker();
        sticker.latime=this.latime;
        sticker.lungime=this.lungime;
        sticker.culoare=this.culoare;
        return sticker;
    }
}
