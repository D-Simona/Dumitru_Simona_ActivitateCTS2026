import java.util.ArrayList;
import java.util.List;

public class SpitalProxy implements ISpital {
    private ISpital spital;
    private List<Vizitator> salaAsteptare;

    public SpitalProxy(ISpital spital) {
        super();
        this.spital = spital;
        this.salaAsteptare=new ArrayList<>();
    }


    @Override
    public void permiteAcces(Vizitator vizitator) {
        if(!vizitator.isAreScrisoareAcceptare()){
            System.out.println("Acces respins pentru "+vizitator.getNume()+": nu are scrisoare de accesptare");
            return;
        }
        salaAsteptare.add(vizitator);
        System.out.println(vizitator.getNume() + "asteapta echiparea");

        if(salaAsteptare.size()>=3) {
            System.out.println("S-au strans minim 3 vizitatori. Se face echiparea");

            for(Vizitator vizitator1: salaAsteptare) {
                vizitator1.echipeazaCuProtectie();
                if(vizitator1.isAreEchipamentProtectie()) {
                    spital.permiteAcces(vizitator1);
                }
            }
            salaAsteptare.clear();
        }
    }
}
