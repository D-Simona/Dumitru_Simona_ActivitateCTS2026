public class NotificareSms extends HandlerNotificare{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getNumarTelefon()!=null && !client.getNumarTelefon().isEmpty()) {
            System.out.println("Sms trimis catre "+client.getNume()
            +" la numarul "+client.getNumarTelefon()+" : "+mesaj);
        } else if (urmatorulHandler!=null) {
            urmatorulHandler.trimiteNotificare(client, mesaj);
        }
    }
}
