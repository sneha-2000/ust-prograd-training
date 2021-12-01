interface Movie{
    void name();
    void type();
}
class Sholay implements Movie{
    public void name(){
        System.out.println("Name: Sholay");
    }
    public void type(){
        System.out.println("Type: Action, Drama, Romance, Comedy ");
    }
}
class Raazi implements Movie{
    public void name(){
        System.out.println("Name: Raazi");
    }
    public void type(){
        System.out.println("Type: Spy thriller ");
    }
}

