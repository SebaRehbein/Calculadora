/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Sebastian
 */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el salario bruto: ");
        int salarioBruto = input.nextInt();

        System.out.print("Ingrese el porcentaje de descuento de la AFP: ");
        int descuentoAFP = input.nextInt();

        int tipoPlan = 0;
        while (tipoPlan <= 3){
        System.out.print("Ingrese el numero de su Plan de salud \n 1. Fonasa \n 2. Isapre \n ");
        
        tipoPlan = input.nextInt();
            if (tipoPlan == 1){
                 int descuentoFonasa = (int) (salarioBruto * 0.07);
            }else if (tipoPlan == 2){
                 System.out.println("Ingrese el valor de su plan Isapre en UF");
                 int isapre = input.nextInt();
                 int valorIsaprePesos = isapre * 31706;                
            }
            else System.out.println("El dato ingresado no es correcto, intente nuevamente");
            break;                        
            }
       
        
        
        
        System.out.print("Ingrese la gratificación: ");
        int gratificacion = input.nextInt();

        int descuentoAFPValor = salarioBruto * descuentoAFP / 100;
        int descuentoSaludValor = tipoPlan;
        int sueldoBase = salarioBruto - descuentoAFPValor - descuentoSaludValor;
        int sueldoLiquido = sueldoBase + gratificacion;

        
        System.out.println("El sueldo líquido es: $" + sueldoLiquido); 
    }
}

