public class Program {
    public static void main(String[] args) {
        HandlerNotificare notificareSms = new NotificareSms();
        HandlerNotificare notificareEmail = new NotificareEmail();
        HandlerNotificare notificareManager = new NotificareManager();

        notificareSms.setUrmatorulHandler(notificareEmail);
        notificareEmail.setUrmatorulHandler(notificareManager);

        Client client1 = new Client("Popescu", "070000000", "popescu@email.com");
        Client client2 = new Client("Ionescu", null, "ionescu@email.com");
        Client client3 = new Client("Georgescu", "", "");

        String mesaj = "Restaurantul are o oferta noua pentru clientii fideli.";

        notificareSms.trimiteNotificare(client1, mesaj);
        notificareSms.trimiteNotificare(client2, mesaj);
        notificareSms.trimiteNotificare(client3, mesaj);
    }
}
