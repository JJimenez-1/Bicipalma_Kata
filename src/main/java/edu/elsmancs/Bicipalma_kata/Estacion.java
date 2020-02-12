package edu.elsmancs.Bicipalma_kata;

public class Estacion {
    private final int id;
    private final String direccion;
    private final int numeroAnclajes;
    private Bicicleta[] anclajes = null;

    public Estacion(int id, String direccion, int anclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = anclajes;
        private Bicicleta[] anclajes = null;
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

    public void consultarEstacion() {
        System.out.println("id: " + getId());
        System.out.println("direccion:" + getDireccion());
        System.out.println("Numero Anclajes:" + getNumeroAnclajes());
    }
}
