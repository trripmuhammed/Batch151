package day27interface;

public class CarRunner {
    public static void main(String[] args) {
        Engine.stop();//stop methodu static olduğundan interfac ismi ile ulastım

        Honda h=new Honda();
        h.eco();//eco methodu static olmadığından (default method)"object" ile ulastım
    }
}
