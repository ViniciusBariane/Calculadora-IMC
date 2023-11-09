package codes;

import java.util.Scanner;

public class CalcImc {
    public double imc, peso, altura;
    Scanner scanner = new Scanner(System.in);
    
    public double calcular(double peso, double altura){
        double imc = peso / (altura * altura);
        return imc; 
    }  
}