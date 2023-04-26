public class Motocicleta extends Vehiculo {
    private int CentimetrosCubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centimetrosCubicos, String marca) {
        CentimetrosCubicos = centimetrosCubicos;
        this.marca = marca;
    }

    public int getCentimetrosCubicos() {
        return CentimetrosCubicos;
    }

    public void setCentimetrosCubicos(int centimetrosCubicos) {
        CentimetrosCubicos = centimetrosCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "CentimetrosCubicos=" + CentimetrosCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }


    public void HacerCaballito(){
        System.out.println("Haciendo un caballito para romperme las costillas");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta " +  this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta " + this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando la motocicleta con bendicion " + this.CentimetrosCubicos + "CC");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando la motocicleta con bendicion" + this.CentimetrosCubicos + "CC");

    }
}
