package main.java;

public class CorpoHumano {

    private double massa;
    private double densidade;
    private double volume;
    private double altura;
    private double imc;

    public CorpoHumano(double massa, double volume, double altura){
        this.massa = massa;
        this.volume = volume;
        this.altura = altura;       
        densidade = massa / volume;
        imc = calcularIMC();
    }

    public double getMassa()
    {
        return massa;
    }
    public double getVolume()
    {
        return volume;
    }
    public double getDensidade()
    {
        return densidade;
    }

    public double getAltura()
    {
        return altura;
    }

    public double getIMC()
    {
        return imc;
    }

    public void setMassa(double massa)
    {
        this.massa = massa;
        densidade = massa / volume;
        imc = calcularIMC();
    }
    public void setVolume(double volume)
    {
        this.volume = volume;
        densidade = massa / volume;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
        imc = calcularIMC();
    }

    public double calcularIMC(){
        return massa / (altura*altura);
    }
    }
