package ar.edu.unahur.obj2.marcas.MarcasYJarras;

public class Jarra {
    private Integer capacidad;
    private Marca marca;

    public Jarra(Integer capacidad, Marca marca) {
        this.capacidad = capacidad;
        this.marca = marca;
    }

    public Integer capacidad(){
        return this.capacidad;
    }
}
