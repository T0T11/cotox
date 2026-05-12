package edu.teamrocket.cotox.carrera;

import edu.teamrocket.cotox.conductores.conductor;
import edu.teamrocket.cotox.conductores.poolconductores;


public class carrera {


    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private int tiempoCarrera;
    private double costeTotal;
    private int propina;

    public Carrera(String tarjetaCredito) {}

    public String getTarjetaCredito() { return null; }

    public void setOrigen(String origen) {}

    public String getOrigen() { return null; }

    public void setDestino(String destino) {}

    public String getDestino() { return null; }

    public void setDistancia(double distancia) {}

    public double getDistancia() { return 0; }

    public double getCosteEsperado() { return 0; }

    public int getTiempoEsperado() { return 0; }

    public void setTiempoEsperado(int tiempo) {}

    public int getTiempoCarrera() { return 0; }

    public void setTiempoCarrera(int tiempo) {}

    public Conductor getConductor() { return null; }

    public void setConductor(Conductor conductor) {}

    public void asignarConductor(PoolConductores conductores) {}

    public void realizarPago(double pago) {}

    public double getCosteTotal() { return 0; }

    public void recibirPropina(int propina) {}

    public int getPropina() { return 0; }

    public void liberarConductor() {}

}
