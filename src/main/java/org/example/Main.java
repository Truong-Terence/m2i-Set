package org.example;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        colors.add("Rouge");
        colors.add("Cyan");
        colors.add("Bleu");
        colors.add("Vert");
        System.out.println("Initialisation de la HashSet colors : " + colors);

        colors.remove("Rouge");
        System.out.println("HashSet colors après suppression de la couleur Rouge : " + colors);

        Set<String> others = new HashSet<String>();
        others.add("Jaune");
        others.add("Magenta");

        colors.addAll(others);
        System.out.println("HashSet colors après ajout de la 2nd Hashset (others): " + colors);

        if (colors.contains("Vert")) {
            colors.remove("Vert");
        }
        System.out.println("HashSet colors après suppression de Vert SI colors contient Vert : " + colors);

        colors.removeAll(others);
        System.out.println("HashSet colors après suppression de tous les éléments contenus dans others : " + colors);



        colors.clear();
        others.clear();

        System.out.println("HashSet colors après avoir vidé les éléments : " + colors);
        System.out.println("HashSet others après avoir vidé les éléments : " + others);

    }
}