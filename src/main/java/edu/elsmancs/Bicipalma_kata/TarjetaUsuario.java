package edu.elsmancs.Bicipalma_kata;

public class TarjetaUsuario {

    private int id = 0;
    private Boolean activada = false;

    public TarjetaUsuario(int id, Boolean activada){
        this.id = id;
        this.setActivada(activada);
    }

    public Boolean getActivada() {
        return activada;
    }
    public void setActivada(Boolean activada) {
        this.activada = activada;
    }
}
