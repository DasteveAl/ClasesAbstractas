package Animales;
public abstract class Animal {
    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombre_cientifico;

    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitat();
}
