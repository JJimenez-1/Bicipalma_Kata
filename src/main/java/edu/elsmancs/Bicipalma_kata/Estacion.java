package edu.elsmancs.Bicipalma_kata;

public class Estacion {
    private final int id;
    private final String direccion;
    private final int numeroAnclajes;
    private final Bicicleta[] anclajes;

    public Estacion(int id, String direccion, int anclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = anclajes;
        this.anclajes = new Bicicleta[anclajes];
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

    public int anclajesLibres() {

        int anclajesLibres = 0;
        for (Bicicleta anclaje: this.anclajes) {
            if (anclaje == null) {
                anclajesLibres++;
            } else ;
        }
        return anclajesLibres;
    }


}
