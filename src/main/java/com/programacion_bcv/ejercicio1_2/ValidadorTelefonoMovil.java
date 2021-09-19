package com.programacion_bcv.ejercicio1_2;

import java.util.regex.*;

public class ValidadorTelefonoMovil {
    private String telefono;

    public ValidadorTelefonoMovil(String telefono) throws Exception {
        if (!telefonoValido(telefono)) {
            throw new Exception(telefono + "es un numero invalido");
        }
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) throws Exception {
        if (!telefonoValido(telefono)) {
            throw new Exception("Telefono invalido");
        }
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ValidadorTelefonoMovil{" +
                "telefono='" + telefono + '\'' +
                '}';
    }

    public boolean telefonoValido(String telefono) {
        Pattern p = Pattern.compile("^([(+]?(549|54)?0?345\\)?\\s?(15)?\\d{7})$");
        Matcher m;
        m = p.matcher(telefono);
        return m.matches();
    }
}
