package com.mycompany.principioliskov;

class Coche extends Vehículo {
    protected double combustible;
    protected double autonomiaMaxima;
    
    public Coche (double combustible , double autonomiaMaxima){
    this.combustible = combustible;
    this.autonomiaMaxima = autonomiaMaxima;
    this.kilometrosRecorridos = 0;
    }
    
    @Override
    public void mover(double distancia) {
    if (combustible > 0){
    }
    }

    @Override
    public double calcularAutonomia() {
        return combustible * 10;
    }
    
}
