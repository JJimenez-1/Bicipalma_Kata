package edu.elsmancs.Bicipalma_kata;

public class Estacion {
    private final int id;
    private final String direccion;
    private final int numeroAnclajes;

    public Estacion(int id, String direccion, int anclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = anclajes;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }


}
