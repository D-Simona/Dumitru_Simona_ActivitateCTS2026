public class NotificareManager extends HandlerNotificare {
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println("Notificare catre manager: clientul "+client.getNume()
        + " nu are date de contact disponibile.");
    }
}
