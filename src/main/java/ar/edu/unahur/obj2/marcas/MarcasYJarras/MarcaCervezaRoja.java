package ar.edu.unahur.obj2.marcas.MarcasYJarras;

public class MarcaCervezaRoja extends Marca{

    //constructor
    public MarcaCervezaRoja(Double graduacion, Double cantidadLupulo, String paisOrigen, String nombre) {
        super(graduacion, cantidadLupulo, paisOrigen, nombre);
    }

    //getter
    public Double graduacion() {
        return Math.min(2*cantidadLupulo(), GraduacionReglamentaria.getInstance().getValor()) *1.25;
    }

}
