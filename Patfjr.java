/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patfjr;
import java.util.Scanner;
/**
 *
 * @author Praktikum
 */
public class Patfjr {
    public static void main(String[] args) {
    System.out.println("Masukkan Bilangan : ");
    int size = new Scanner(System.in).nextInt();
        
    for (int i = 1; i < size; i += 2) {
        for (int a = size; a >= i; a -= 2) {
            System.out.print("0");
        }
        for (int b = 1; b <= i; b++) {
            System.out.print("*");
        }
        for (int a = size; a >= i; a -= 2) {
            System.out.print("0");
        }
        System.out.println();
    }

    for (int i = 1; i <= size; i += 2) {
        for (int a = 1; a <= i; a += 2) {
            System.out.print("0");
        }
        for (int b = size; b >= i; b--) {
            System.out.print("*");
        }
        for (int a = 1; a <= i; a += 2) {
            System.out.print("0");
        }
        System.out.println();
    }
    }
}
