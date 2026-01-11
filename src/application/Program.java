package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // criando um objeto Rectangle
        // width e height existem, mas valem 0.0
        Rectangle rect = new Rectangle();

        // recebendo entrada do usuário
        // valores serão guardados dentro do objeto rect
        System.out.println("Enter rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        // printando os valores retornados pelos métodos
        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

        sc.close();
    }
}