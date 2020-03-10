/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastardo;

public class Cosa {
    private float precio;
    private boolean electrodomestico;
    private boolean comida;

    public Cosa(float precio, boolean electrodomestico, boolean comida) {
        this.precio = precio;
        if(electrodomestico){
            this.electrodomestico = true;
            this.comida = false;
        } else {
            this.comida = false;
            this.electrodomestico = false;
        }
        
    }

    public float getPrecio() {
        return precio;
    }

    public boolean isElectrodomestico() {
        return electrodomestico;
    }

    public boolean isComida() {
        return comida;
    }
    
    
}
