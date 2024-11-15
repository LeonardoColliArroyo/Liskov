package com.mycompany.principioliskov;

class Bicicleta extends Vehículo {
    
    public Bicicleta(){
    this.kilometrosRecorridos = 0;
    }

    @Override
    public void mover(double distancia) {
        kilometrosRecorridos +=distancia;
        System.out.println("La bicicleta ha recorrido " + distancia + "km.");
    }

    @Override
    public double calcularAutonomia() {
        return -1;
    }
    
}
