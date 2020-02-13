package edu.elsmancs.Bicipalma_kata;

import java.util.concurrent.ThreadLocalRandom;

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

    public void anclarBicicleta(Bicicleta bicicleta) {

        int posicion = 0;
        int numeroAnclaje = posicion + 1;
        boolean anclajeOcupado = false;

        while(anclajeOcupado != true) {
                if (this.anclajes[posicion] == null ) {
                    this.anclajes[posicion] = bicicleta;
                    mostrarAnclaje(bicicleta, numeroAnclaje);
                    anclajeOcupado = true;
                }
                else {
                    posicion++;
                    numeroAnclaje++;
                }
        }
    }

    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
        int posicion = generarAnclaje();
        int numeroAnclaje = posicion + 1;

        if (leerTarjetaUsuario(tarjetaUsuario)){
            boolean biciRetirada = tarjetaUsuario.getActivada();

            while(biciRetirada == false){

                if (this.anclajes[posicion] != null){
                    mostrarBicicleta(this.anclajes[posicion], numeroAnclaje);
                    this.anclajes[posicion] = null;
                    biciRetirada = true;
                }
                else{
                    posicion++;
                    numeroAnclaje++;
                }
         }
        }
        else {
            System.out.println("Tarjeta inactiva: " + tarjetaUsuario.getId());
        }
    }

    public Boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
        return tarjetaUsuario.getActivada();
    }

    public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje){
        System.out.println("bicicleta: " + bicicleta.getId() + " anclada en el anclaje :" + numeroAnclaje);
    }

    public void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje){
        System.out.println("Bicicleta desanclada: " + bicicleta.getId() + " del anclaje: " + numeroAnclaje);
    }

    public int generarAnclaje(){
        Integer entero = ThreadLocalRandom.current().nextInt(0,this.anclajes.length);
        return entero;
    }
}




