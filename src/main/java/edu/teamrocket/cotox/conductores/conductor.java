package edu.teamrocket.cotox.conductores;


import java.util.ArrayList;

public class Conductor {

    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado;
    private ArrayList<Byte> valoraciones;

    public Conductor(



    ) {}

    public Conductor(String nombre) {


    }

    public String getNombre() { return this.nombre; }

    public String getModelo() { return this.modelo; }

    public void setModelo(String modelo) {}

    public String getMatricula() { return this.matricula; }

    public void setMatricula(String matricula) {
    }

    public double getValoracion() { return this.valoracionMedia / ; }

    public int getNumeroValoraciones() {
        int cantidadValoracion = this.valoraciones.size();
        return cantidadValoracion
                ; }

    public void setValoracion(byte valoracion) {}

    public double calcularValoracionMedia() { return 0; }

    public void setOcupado(boolean ocupado) {
        ;

    }

    public boolean isOcupado() { return false; }


}
