package edu.elsmancs.Bicipalma_kata;

public class TarjetaUsuario {

    private int id = 0;
    private Boolean activada = false;

    public TarjetaUsuario(int id, Boolean activada){
        this.id = id;
        this.activada = activada;
    }

    public Boolean getActivada() {
        return activada;
    }
    public void setActivada(Boolean activada) {
        this.activada = activada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
