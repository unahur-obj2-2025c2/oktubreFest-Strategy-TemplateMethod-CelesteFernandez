import ar.edu.unahur.obj2.marcas.Marca;

public class MarcaCervezaRubia implements Marca {
    
    @Override
    public Double graduacion() {
        return 4.7;
    }

    @Override
    public Double cantidadLupulo() {
        return 15.0;
    }

    @Override
    public String paisOrigen() {
        return "Argentina";
    }

    @Override
    public String nombre() {
        return "Quilmes";
    }

}
