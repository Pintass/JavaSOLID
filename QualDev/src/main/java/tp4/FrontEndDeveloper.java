package tp4;

public class FrontEndDeveloper implements Developer {
    @Override
    public void develop() {
        this.writeJavascript();
    }
    public void writeJavascript() {
        System.out.println("Je developpe en JavaScript !");
    }
}
