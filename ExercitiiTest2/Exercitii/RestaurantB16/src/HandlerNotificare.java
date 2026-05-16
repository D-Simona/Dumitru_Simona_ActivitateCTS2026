public abstract class HandlerNotificare {
    protected HandlerNotificare urmatorulHandler;

    public void setUrmatorulHandler(HandlerNotificare urmatorulHandler) {
        this.urmatorulHandler = urmatorulHandler;
    }

    public abstract void trimiteNotificare(Client client, String mesaj);
}
