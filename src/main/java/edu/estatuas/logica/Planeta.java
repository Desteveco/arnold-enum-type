package edu.estatuas.logica;

import java.util.EnumSet;

public enum Planeta {

    MERCURY(3.303e+23, 2.4397e+6),
    VENUS(4.869e+24, 6.0518e+6),
    EARTH(5.976e+24, 6.37814e+6),
    MARS(6.421e+23, 3.3972e+6),
    JUPITER(1.9e+27, 7.1492e+7),
    SATURN(5.688e+26, 6.0268e+7),
    URANUS(8.686e+25, 2.5559e+7),
    NEPTUNE(1.024e+26, 2.4746e+7);

    public static final double G = 6.67400E-11;

    private double masa = 0f;
    private double radio = 0f;

    //constructor privado en los metodos enum

    private Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    public double getMasa() {
        return masa;
    }

    public double getRadio() {
        return radio;
    }

    public static EnumSet<Planeta> getPlanetasTerrestres() {
        return EnumSet.range(MERCURY, MARS);
    }

    public static EnumSet<Planeta> getGigantesGaseosos() {
        return EnumSet.complementOf(getPlanetasTerrestres());
    }

    public double pesoSuperficie(double peso) {
        return masaHumano(peso) * this.gravedadSuperficial();
    }

    public double masaHumano(double peso) {
        return peso / this.gravedadSuperficial(EARTH);
    }

    public double gravedadSuperficial(Planeta planeta) {
        return G * planeta.getMasa() / (Math.pow(planeta.getRadio(), 2));
    }

    public double gravedadSuperficial() {
        return G * this.getMasa() / (Math.pow(this.getRadio(), 2));
    }
    
}
