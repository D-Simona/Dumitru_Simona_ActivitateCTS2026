package ro.ase.cts.clase;

public class Personaj implements PersonajPrototip{
    private String rasa;
    private String sex;
    private int hp;

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Personaj(String rasa, String sex, int hp) {
        if(rasa.length()>3){
            this.rasa = rasa;
        }else {
            this.rasa="NaN";
        }
        if(sex.length()>3){
            this.sex = sex;
        }else {
            this.sex=" ";
        }
        if(hp>100){
            this.hp = hp;
        }else {
            this.hp=0;
        }
    }

    public Personaj() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personaj{");
        sb.append("rasa='").append(rasa).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", hp=").append(hp);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public PersonajPrototip copiaza() {
        Personaj personaj = new Personaj();
        personaj.rasa=this.rasa;
        personaj.sex=this.sex;
        personaj.hp=this.hp;
        return personaj;
    }
}
