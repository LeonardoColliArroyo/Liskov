package com.mycompany.principioliskov;

public class PruebaVehículo {
    public static void PruebaVehículo(Vehículo vehículo, double distancia) {
        System.out.println("\nProbando Vehículo de tipo " + 
                vehículo.getClass().getSimpleName() + ":");
                vehículo.mover(distancia);
                System.out.println("Autonomia restante:" + vehículo.calcularAutonomia() + "km.");
                System.out.println("Kilometros recorridos:" + vehículo.kilometrosRecorridos + "km.");
                System.out.println("--------------------------------");
    }
    
    public static void main(String[] args) {
        Coche coche = new Coche (50, 500);
        Camion camion = new Camion (100, 800);
        Bicicleta bicicleta = new Bicicleta();
        
        PruebaVehículo(coche, 100);
        PruebaVehículo(camion, 100);
        PruebaVehículo(bicicleta, 50);
    }
}
