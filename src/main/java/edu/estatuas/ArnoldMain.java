package edu.estatuas;

import edu.estatuas.logica.Planeta;

/**
 * Hello world!
 */
public class ArnoldMain{

    public static void main(String[] args) {
        double peso = 1.0; //Kg

        for (Planeta planeta : Planeta.values()) {
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("Your weight on the terrestrial planets:");
        for (Planeta planeta : Planeta.getPlanetasTerrestres()) {
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("Your weight on the gas giant planets:");
        for (Planeta planeta : Planeta.getGigantesGaseosos()) {
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

    }
}
