package ro.ase.cts.clase;

public class Contract implements ContractPrototip {
    private String numeVanzator;
    private String numeCumparator;

    public void setNumeVanzator(String numeVanzator) {
        this.numeVanzator = numeVanzator;
    }

    public void setNumeCumparator(String numeCumparator) {
        this.numeCumparator = numeCumparator;
    }

    public Contract(String numeVanzator, String numeCumparator) {
        if(numeVanzator.length()>3){
            this.numeVanzator = numeVanzator;

        }else {
            this.numeVanzator="NaN";
        }
        if(numeCumparator.length()>3){
            this.numeCumparator = numeCumparator;
        }else {
            this.numeCumparator="NaN";
        }
    }

    private Contract() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contract{");
        sb.append("numeVanzator='").append(numeVanzator).append('\'');
        sb.append(", numeCumparator='").append(numeCumparator).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public ContractPrototip copiaza() {
        Contract contract = new Contract();
        contract.numeCumparator=this.numeCumparator;
        contract.numeVanzator=this.numeVanzator;
        return contract;
    }

}
