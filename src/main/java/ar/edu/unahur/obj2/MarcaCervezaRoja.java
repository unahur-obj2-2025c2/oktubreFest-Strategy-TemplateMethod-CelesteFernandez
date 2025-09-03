package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.marcas.Marca;

public class MarcaCervezaRoja implements Marca {
    
    @Override
    public Double graduacion() {
        return 6.0;
    }

    @Override
    public Double cantidadLupulo() {
        return 15.0;
    }

    @Override
    public String paisOrigen() {
        return "Bélgica";
    }

    @Override
    public String nombre() {
        return "Leffe";
    }

}
