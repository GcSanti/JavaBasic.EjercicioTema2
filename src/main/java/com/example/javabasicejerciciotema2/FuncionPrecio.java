package com.example.javabasicejerciciotema2;
import java.util.Scanner;

public class FuncionPrecio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir precio: ");

        int numero = scanner.nextInt();

        double iva = numero * 0.21;

        double suma = numero + iva;

        System.out.println("Precio más IVA es: " + suma);
    }
}


