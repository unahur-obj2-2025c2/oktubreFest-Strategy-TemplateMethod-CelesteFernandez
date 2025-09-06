package ar.edu.unahur.obj2.marcas.MarcasYJarras;

public class GraduacionReglamentaria {

    private static GraduacionReglamentaria instance;
    private Double valor; 

    public static GraduacionReglamentaria getInstance() {
        if (instance == null) {
            instance = new GraduacionReglamentaria();
        }
        return instance;
    }

    public Double getValor() {
        return valor;
    }

    public void cambiarValor(Double nuevoValor) {
        this.valor = nuevoValor;
    }
}
