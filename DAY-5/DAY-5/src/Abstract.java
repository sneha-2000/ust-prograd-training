public class Abstract {
    public static void main(String[] args) {
        Books fictional= new Fictional();
        Books nonfictional = new Nonfictional();
        fictional.show();
        fictional.name();
        fictional.color();
        nonfictional.name();
        nonfictional.color();
    }
}
