package ar.edu.unahur.obj2.marcas.MarcasYJarras;

public class MarcaCervezaNegra extends Marca{
    //constructor
    public MarcaCervezaNegra(Double graduacion, Double cantidadLupulo, String paisOrigen, String nombre) {
        super(graduacion, cantidadLupulo, paisOrigen, nombre);
    }

    //getter
    public Double graduacion() {
        return Math.min(2*cantidadLupulo(), GraduacionReglamentaria.getInstance().getValor());
    }

}
