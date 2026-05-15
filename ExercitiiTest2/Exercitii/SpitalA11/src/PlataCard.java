public class PlataCard implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Pacientul a platit cu cardul suma de "+suma+" lei");
    }
}
