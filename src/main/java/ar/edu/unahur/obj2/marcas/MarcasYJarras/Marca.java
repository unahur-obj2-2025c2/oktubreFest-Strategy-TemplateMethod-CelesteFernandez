package ar.edu.unahur.obj2.marcas.MarcasYJarras;

public abstract class Marca {
    private Double graduacion; //porcentaje de alcohol en volumen. Ej. una cerveza de 10 % de graduación, tendrá 0.1 litro de alcohol por litro de cerveza:
    private Double cantidadLupulo; //gramos por litro
    private String paisOrigen;
    private String nombre;

    //constructor
    public Marca(Double graduacion, Double cantidadLupulo, String paisOrigen, String nombre) {
        this.graduacion = graduacion;
        this.cantidadLupulo = cantidadLupulo;
        this.paisOrigen = paisOrigen;
        this.nombre = nombre;
    }

    //getters
    public Double graduacion() {
        return this.graduacion;
    }
    
    public Double cantidadLupulo() {
        return this.cantidadLupulo;
    }
} 
