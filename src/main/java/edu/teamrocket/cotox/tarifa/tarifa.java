package edu.teamrocket.cotox.tarifa;

import edu.teamrocket.cotox.carrera.carrera;

public class tarifa {


    private double COSTE_MILLA;
    private double COSTE_MINUTO;
    private double COSTE_MINIMO;
    private byte PORCENTAJE_COMISION;

    public Tarifa() {}

    public double getCosteDistancia(double distancia) { return 0; }

    public double getCosteTiempo(int minutos) { return 0; }

    public double getCosteTotalEsperado(Carrera carrera) { return 0; }


}
