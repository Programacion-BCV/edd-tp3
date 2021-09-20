package com.programacion_bcv.ejercicio3_4;

public class RegistroAlturaRio {
    private String puerto;
    private String rio;
    private String ultimoRegistro;
    private String fechaHora;
    private String estado;

    public RegistroAlturaRio(String puerto, String rio, String ultimoRegistro, String fechaHora, String estado) {
        this.puerto = puerto;
        this.rio = rio;
        this.ultimoRegistro = ultimoRegistro;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getRio() {
        return rio;
    }

    public void setRio(String rio) {
        this.rio = rio;
    }

    public String getUltimoRegistro() {
        return ultimoRegistro;
    }

    public void setUltimoRegistro(String ultimoRegistro) {
        this.ultimoRegistro = ultimoRegistro;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "RegistroAlturaRio{" +
                "puerto='" + puerto + '\'' +
                ", rio='" + rio + '\'' +
                ", ultimoRegistro='" + ultimoRegistro + '\'' +
                ", fechaHora='" + fechaHora + '\'' +
                ", estado='" + estado + '\'' +
                '}' + "\n";
    }
}
