package ro.ase.cts.clase;

public abstract class ANod {
    //nod frunza = produsul pe care pot sa-l comand + metodele specifice:
    public abstract String getDenumire();
    public abstract int getPret();

   //pentru toate nodurile -> implementare concreta pe nod frunza
    public String getInfo(){
        return this.getDenumire() + " " + this.getPret();
    }

    //metode specifice nodurilor structura - implementare convenabila pentru un nod frunza
    public void adaugaNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public void eliminationNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public ANod getNod(int i){
        throw new UnsupportedOperationException();
    }
}
