package tp4;

public class BackEndDeveloper implements Developer {
    @Override
    public void develop() {
        this.writeJava();
    }
    public void writeJava() {
        System.out.println("Je developpe en Java !");
    }
}


