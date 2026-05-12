package edu.teamrocket.cotox.conductores;


import java.util.ArrayList;

public class conductor {

    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado;
    private ArrayList<Byte> valoraciones;

    public Conductor() {}

    public Conductor(String nombre) {}

    public String getNombre() { return null; }

    public String getModelo() { return null; }

    public void setModelo(String modelo) {}

    public String getMatricula() { return null; }

    public void setMatricula(String matricula) {}

    public double getValoracion() { return 0; }

    public int getNumeroValoraciones() { return 0; }

    public void setValoracion(byte valoracion) {}

    public double calcularValoracionMedia() { return 0; }

    public void setOcupado(boolean ocupado) {}

    public boolean isOcupado() { return false; }


}
