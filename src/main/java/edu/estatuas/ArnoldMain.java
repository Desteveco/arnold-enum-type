package edu.estatuas;

import edu.estatuas.logica.Planeta;

public class ArnoldMain{

    public static void main(String[] args) {
        double peso = 73.0; //Kg

        for (Planeta planeta : Planeta.values()) {
            System.out.printf("Your weight on %s is %f N%n\n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("Your weight on the terrestrial planets:\n");
        for (Planeta planeta : Planeta.getPlanetasTerrestres()) {
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("Your weight on the gas giant planets:\n");
        for (Planeta planeta : Planeta.getGigantesGaseosos()) {
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

    }
}
