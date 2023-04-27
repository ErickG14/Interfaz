public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("Premium", 3 );

        System.out.println(camion);

        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println( camion.apagar());

        System.out.println("-------------MOTO-----------");
        Motocicleta moto = new Motocicleta(1000 , "BMW");

        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.HacerCaballito();
        moto.frenar();
        moto.apagar();



    }
}
