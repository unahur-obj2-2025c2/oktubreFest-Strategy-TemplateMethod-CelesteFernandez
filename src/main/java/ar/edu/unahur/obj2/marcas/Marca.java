package ar.edu.unahur.obj2.marcas;

public abstract class Marca {
    private Double graduacion;
    private Double cantidadLupulo;
    private String paisOrigen;
    private String nombre;


    //constructor
    public Marca(Double graduacion, Double cantidadLupulo, String paisOrigen, String nombre) {
        this.graduacion = graduacion;
        this.cantidadLupulo = cantidadLupulo;
        this.paisOrigen = paisOrigen;
        this.nombre = nombre;
    }

    public Double graduacion() {
        return this.graduacion;
    }

    public Double cantidadLupulo() {
        return this.cantidadLupulo;
    }
} 
