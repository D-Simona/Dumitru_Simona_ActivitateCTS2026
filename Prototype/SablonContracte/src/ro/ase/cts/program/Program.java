package ro.ase.cts.program;

import ro.ase.cts.clase.Contract;
import ro.ase.cts.clase.ContractPrototip;

public class Program {
    public static void main(String[] args) {
        ContractPrototip contract = new Contract("Ion Ionescu", "Vasile Vasilescu");
        ContractPrototip contract1 = contract.copiaza();
    }
}
