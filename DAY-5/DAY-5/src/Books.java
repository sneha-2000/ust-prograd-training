abstract class Books{
    abstract void color();
    abstract void name();
    void show(){
        System.out.println("I am a book!!");
    }
}
class Fictional extends Books{
    public void color() {
        System.out.println("color: red");
    }
    public void name() {
        System.out.println("name : City of Girls");
    }
}
class Nonfictional extends Books{
    public void color() {
        System.out.println("color: Orange");
    }
    public void name() {
        System.out.println("name : Wings of Fire");
    }
}
