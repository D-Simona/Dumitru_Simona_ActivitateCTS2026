public class NotificareEmail extends HandlerNotificare {
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getAdresaEmail()!=null && !client.getAdresaEmail().isEmpty()) {
            System.out.println("Email trimis catre "+client.getNume()
            +" la adresa "+client.getAdresaEmail()
            +": "+mesaj);
        }else if (urmatorulHandler!=null) {
            urmatorulHandler.trimiteNotificare(client, mesaj);
        }
    }
}
