package Animales;
public class Prueba {
    public static void main(String[] args){
        Animales.Animal[] animales = new Animales.Animal[4];

        animales[0] = new Animales.Gato();
        animales[1] = new Animales.Perro();
        animales[2] = new Animales.Lobo();
        animales[3] = new Animales.Leon();

        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].getNombreCientifico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimentos());
            System.out.println("Habitat: " + animales[i].getHabitat());
            System.out.println();
        }
    }
}
