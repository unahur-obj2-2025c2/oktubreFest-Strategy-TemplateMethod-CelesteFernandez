package ar.edu.unahur.obj2.marcas.Personas;

import java.util.List;

import ar.edu.unahur.obj2.marcas.MarcasYJarras.Jarra;
import ar.edu.unahur.obj2.marcas.MarcasYJarras.Marca;

public class Persona {
    private Double peso;
    private List<Jarra> jarrasCompradas;
    private Boolean leGustaLaMusicaTradicional;
    private Integer aguante;

    //metodos
    public Boolean estaEbrio() {
        Double litrosConsumidos = jarrasCompradas.stream().mapToDouble(j -> j.capacidad()).sum();
        return (litrosConsumidos * this.peso) > this.aguante;
    }

    public Boolean leGustaLaMarca(Marca unaMarca){}
}
