/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastardo;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 
 * @author User
 */
public class Casa {
    private List<Cosa> compras;
    
    public Casa(){
       compras = new ArrayList<Cosa>();
    }
    
    
    public void comprar(Cosa cosa){
        compras.add(cosa);
    }
    
    public int cantidadCosasCompradas(){
        return compras.size();
    }
    
    public boolean tieneComida(){
        return compras.stream().anyMatch(c-> c.isComida());
    }
    
    public boolean vieneDeEquiparse(){
        //  indica si la última cosa que se compró es un electrodoméstico, o bien vale más de 5000 pesos.
        // return cosas.last().esElectrodomestico() or cosas.last().precio() > 5000
        // if(compras.isEmpty())
        //    return false;
        // Cosa x = compras.get(compras.size()-1);
        
        //return x.isElectrodomestico() || x.getPrecio()>=5000;
        return compras.stream().reduce((first, second)->second)
                .filter(c->c.isElectrodomestico() || c.getPrecio()>=5000 )
                .isPresent();
                
    }
    
    public Double esDerrochona(){
        // esDerrochona(): indica si el importe total de las cosas compradas es de 9000 pesos o más.
        return compras.stream().mapToDouble(c->c.getPrecio()).sum();
    }
    
    public Cosa compraMasCara(){
        // compraMasCara(): retorna la cosa comprada de mayor valor.
        return compras.stream().max(Comparator.comparing(Cosa::getPrecio)).get();

    }
    
    public List<Cosa> electrodomesticosComprados(){
        // electrodomésticosComprados(): devuelve un objeto que contiene todas las cosas compradas que son electrodomésticos.
        
        //List<Cosa> A = compras.stream().filter(c->c.isElectrodomestico()).collect(Collectors.toList());
        List<Cosa> A = compras.stream().filter(Cosa::isElectrodomestico).collect(Collectors.toList());
        
        return A;
        
        
    }
    
    public boolean malaEpoca(){
        // malaEpoca(): indica si todas las cosas compradas son comida.
        return compras.stream().allMatch(c->c.isComida());
    }
    
    public List<Cosa> queFaltaComprar(List<Cosa> lista){
        // queFaltaComprar(lista): recibe una lista de cosas y devuelve las cosas de esa lista que aún no se han comprado. 
        // Atención: es una pregunta. No se pide que se compren.
        List<Cosa> falta = compras.stream()
                .distinct()
                .filter(lista::contains)
                .collect(Collectors.toList());
        return falta;
    }
   
    public boolean faltaComida(){
        // faltaComida(): indica si se han comprado menos de 2 cosas que son comida.
        // return cosas.filter({cosa=>cosa.esComida()}).size() < 2
        return compras.stream().filter(c->c.isElectrodomestico()).count()<2;
                
    }
}
