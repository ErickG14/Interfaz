public abstract class Vehiculo {

    public static final int VLOCIDAD_MAXIMA = 160;
    public static final char CLASIFICACION_EFICIENCIA = 'A';

    public abstract boolean encender();
    public abstract boolean apagar();
    public abstract void avanzar();
    public abstract void frenar();

}
