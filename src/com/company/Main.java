package com.company;

import javax.imageio.ImageTranscoder;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean continuar = true;
        while (continuar) {
            System.out.println();
            System.out.println("MENÚ EJERCICIOS ADICIONALES DE ARRAYS");
            System.out.print("1. intercambiaParImpar");
            System.out.print("\t2. compruebaTarjeta");
            System.out.print("\t\t\t3. tailArray");
            System.out.print("\t\t\t4. detecta5");
            System.out.println("\t\t\t\t5. calculaNPrimos");
            System.out.print("6. EscribeArrayNotas");
            System.out.print("\t7. tachaElementosNoComunes");
            System.out.print("\t8. eliminaRepetidos");
            System.out.print("\t\t9. redondeaArray");
            System.out.println("\t\t10. desordenaArray");
            System.out.print("11. minMaxArray");
            System.out.print("\t\t\t12. graficaBarras");
            System.out.print("\t\t\t13. mejorRacha");
            System.out.println("\t\t\t14. numerosPrimosPro");
            System.out.println("0. Finalizar");
            System.out.print("Indique opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 1: {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a, 5, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    System.out.print("a: ");
                    intercambiaParImpar(a);
                    escribeArray(a);
                }
                break;
                case 2: {
                    int[] a;
                    a = new int[16];
                    rellenaAleatorio2(a, 0, 9);
                    System.out.print("a: ");
                    escribeArray(a);
                    if (compruebaTarjeta(a)) {
                        System.out.println("Tarjeta válida");
                    } else {
                        System.out.println("Tarjeta no válida");
                    }
                    int[] b = {5, 5, 6, 5, 8, 6, 6, 6, 4, 5, 2, 2, 7, 3, 0, 7};
                    escribeArray(b);
                    if (compruebaTarjeta(b)) {
                        System.out.println("Tarjeta válida");
                    } else {
                        System.out.println("Tarjeta no válida");
                    }
                }
                break;
                case 3: {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a, 5, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    Random r = new Random();
                    int r2 = r.nextInt(8 + 1);
                    System.out.print("tailArray (a, " + r2 + "): ");
                    escribeArray(tailArray(a, r2));
                }
                break;
                case 4: {
                    int[] a;
                    a = new int[16];
                    rellenaAleatorio2(a, 0, 5);
                    System.out.print("a (aleatorio): ");
                    escribeArray(a);
                    if (detecta5(a)) {
                        System.out.println("Existen 5 consecutivos");
                    } else {
                        System.out.println("No existen 5 consecutivos");
                    }
                    int[] b = {2, 3, 4, 5, 6, 7, 8, 4, 3, 2, 2, 2, 2, 2, 4, 6, 8, 8};
                    System.out.print("b (forzado):");
                    System.out.print("b: ");
                    escribeArray(b);
                    if (detecta5(b)) {
                        System.out.println("Existen 5 consecutivos");
                    } else {
                        System.out.println("No existen 5 consecutivos");
                    }
                }
                break;
                case 5: {
                    System.out.print("Indique el número de números primos que desee: ");
                    int a = sc.nextInt();
                    escribeArray((calculaNPrimos(a)));
                }
                break;
                case 6: {
                    double[] a;
                    a = new double[8];
                    rellenaAleatorio3(a, -1, 11);
                    System.out.print("a: ");
                    escribeArray2(a);
                    EscribeArrayNotas(a);
                }
                break;
                case 7: {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a, 5, 15);
                    int[] b;
                    b = new int[4];
                    rellenaAleatorio2(b, 5, 15);
                    escribeArray(a);
                    escribeArray(b);
                    tachaElementosNoComunes(a, b);
                    escribeArray(a);
                    escribeArray(b);
                }
                break;
                case 8: {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a, -2, 15);
                    escribeArray(a);
                    escribeArray(eliminaRepetidos(a));
                }
                break;
                case 9: {
                    double[] a;
                    a = new double[8];
                    rellenaAleatorio3(a, 0, 100);
                    System.out.print("a: ");
                    escribeArray2(a);
                    System.out.print("Redondea: ");
                    escribeArray2(redondeaArray(a));
                    System.out.print("Decimales: ");
                    escribeArray2(decimalesArray(a));
                }
                break;
                case 10: {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a, 0, 100);
                    System.out.print("a: ");
                    escribeArray(a);
                    System.out.print("Desordena: ");
                    desordenaArray(a);
                    escribeArray(a);
                }
                break;
                case 11: {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a, 1, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    System.out.print("minMacArray: ");
                    escribeArray(minMaxArray(a));
                }
                break;
                case 12: {
                    int[] a;
                    a = new int[10];
                    rellenaAleatorio2(a, 0, 10);
                    graficaBarras(a);
                }
                break;
                default: {
                    // opcion no válida
                }
            }
        }
    }

    public static void graficaBarras(int[] a) {
        // comprobación de rango
        if(maxArray(a)>10 || minArray(a)<0) {
            System.out.println("Error. Notas no permitidas");
        } else {
            for (int i = 0; i < a.length; i++) {
                if(a[i]<10) System.out.print(" ");
                System.out.print(a[i] + " ");
                // opcional
                String ANSI_RED="\u001B[31m";
                String ANSI_GREEN="\u001B[32m";
                String color;
                if(a[i]>5){
                    color = ANSI_GREEN;
                }
                else
                {
                    color = ANSI_RED;
                }
                System.out.print(color);
                for (int j = 0; j < a[i]; j++) {
                    System.out.print("█");
                }
                System.out.println("\u001B[0m");
            }
        }
    }

    public static int[] minMaxArray(int[] a) {
        int maximo, minimo;
        maximo = maxArray(a);
        minimo = minArray(a);
        int[] b;
        b = new int[1 + maximo - minimo];
        for (int i = 0; i < b.length; i++) {
            b[i] = minimo + i;
        }
        return b;
    }

    public static void desordenaArray(int[] a) {
        Random r = new Random();
        int j;
        int[] b;
        b = new int[a.length];
        j = r.nextInt(a.length + 1);
        for (int i = 0; i < a.length; i++) {
            while (b[j] != 0) {
                j = r.nextInt(a.length);
            }
            b[j] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }

    public static double[] decimalesArray(double[] a) {
        double[] b;
        b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] - redondeaArray(a)[i];
        }
        return b;
    }

    public static double[] redondeaArray(double[] a) {
        double[] b;
        b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            //a[i] = Math.round(a[i]);
            int j = 0;
            while (a[i] > j) {
                j++;
            }
            b[i] = j - 1;
        }
        return b;
    }

    public static int[] eliminaRepetidos(int[] a) {
        int[] b;
        b = new int[a.length];
        int j = 0;
        int maxA = maxArray(a);
        for (int i = 0; i < a.length; i++) {
            if (contiene(b, a[i])) {
                b[j] = maxA + 1;
                j++;
            } else {
                b[j] = a[i];
                j++;
            }
        }
        b = eliminaElementosArray(b, maxA + 1);
        return b;
    }

    public static void tachaElementosNoComunes(int[] a, int[] b) {
        int[] c = a;
        int[] d = b;
        for (int i = 0; i < a.length; i++) {
            if (!contiene(b, a[i])) {
                c[i] = 0;
            } else {
                c[i] = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (!contiene(a, b[i])) {
                d[i] = 0;
            } else {
                d[i] = b[i];
            }
        }
        a = c;
        b = d;
    }

    public static void EscribeArrayNotas(double[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 5 && a[i] <= 10) {
                System.out.print("\u001B[32m");
                System.out.printf("%.2f", a[i]);
                System.out.print("\u001B[0m");
            }
            if (a[i] < 5 && a[i] >= 0) {
                System.out.print("\u001B[31m");
                System.out.printf("%.2f", a[i]);
                System.out.print("\u001B[0m");
            }
            if (a[i] > 10 || a[i] < 0) {
                System.out.print("\u001B[33m");
                System.out.print("ERROR");
                System.out.print("\u001B[0m");
            }
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] calculaNPrimos(int a) {
        int contA, contB, i, j;
        int[] b;
        b = new int[a];
        contB = 0;
        i = 2;
        while (contB < a) {
            contA = 0;
            for (j = i; j >= 2; j--) {
                if (i % j == 0) {
                    contA++;
                }
            }
            if (contA == 1) {
                b[contB] = i;
                contB++;
            }
            i++;
        }
        return b;
    }

    public static boolean detecta5(int[] a) {
        int consec = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                consec++;
                if (consec == 4) {
                    return true;
                }
            } else {
                consec = 0;
            }
        }
        return false;
    }

    public static int[] tailArray(int[] a, int n) {
        if (n == 0 || n > a.length) {
            System.out.println("Error");
            return a;
        } else {
            int[] b;
            b = new int[n];
            for (int i = 0; i < b.length; i++) {
                b[i] = a[i + a.length - b.length];
            }
            return b;
        }
    }

    public static boolean compruebaTarjeta(int[] a) {
        if (a.length == 16) {
            int suma = 0, prod;
            for (int i = 0; i < 16; i = i + 2) {
                prod = a[i] * 2;
                if (prod > 10) {
                    suma = suma + prod - 9;
                } else {
                    suma = suma + prod;
                }
            }
            return suma % 10 == 0;
        } else {
            System.out.println("Error: ");
            return false;
        }
    }

    public static void intercambiaParImpar(int[] a) {
        if (a.length % 2 == 0) {
            int b;
            for (int i = 0; i < a.length; i = i + 2) {
                b = a[i];
                a[i] = a[i + 1];
                a[i + 1] = b;
            }
        } else {
            System.out.println("Error: el array tiene un número impar de elementos");
        }
    }

    // anteriores
    public static int[] ordenaBurbuja(int[] a) {
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int b = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = b;
                }
            }
        }
        return a;
    }

    public static int[] recortaArray(int[] a, int p1, int p2) {
        int[] c;
        c = new int[a.length - p2 + p1 - 1];
        // desde 0 hasta p1
        int i;
        for (i = 0; i < p1; i++) {
            c[i] = a[i];
        }
        // desde p2 hasta final
        for (int j = p2 + 1; j < a.length; j++) {
            c[i] = a[j];
            i++;
        }
        return c;
    }

    public static int[] subArray(int[] a, int p1, int p2) {
        int[] c;
        c = new int[p2 - p1];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i + p1];
        }
        return c;
    }

    public static int[] insertaArrayEnArray(int[] a, int pos, int[] b) {
        int[] c;
        int i, j;
        c = new int[a.length + b.length];
        // insertar elementos de a desde 0 a pos
        for (i = 0; i < pos; i++) {
            c[i] = a[i];
        }
        // insertar elementos de b
        for (j = 0; j < b.length; j++) {
            c[i] = b[j];
            i++;
        }
        //insertar resto elementos de a
        j = 0;
        for (; i < c.length; i++) {
            c[i] = a[j + pos];
            j++;
        }
        return c;
    }

    public static int[] elimina1ElementoArray(int[] a, int b) {
        int[] c;
        if (!contiene(a, b)) {
            c = new int[a.length];
            c = a;
        } else {
            c = new int[a.length - 1];
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b) {
                    c = borraDeArray(a, i);
                    return c;
                }
            }
        }
        return c;
    }

    public static int[] borraDeArray(int[] a, int pos) {
        int[] b;
        b = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            if (i < pos) {
                b[i] = a[i];
            } else {
                b[i] = a[i + 1];
            }
        }
        return b;
    }

    public static int[] insertaEnArray(int[] a, int valor, int pos) {
        int[] b;
        b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            if (i < pos) {
                b[i] = a[i];
            } else {
                b[i + 1] = a[i];
            }
        }
        b[pos] = valor;
        return b;
    }

    public static int[] copiarArrayPro(int[] a) {
        int[] b;
        b = new int[a.length];
        b = a;
        return b;
    }

    public static int[] concatenaArraysPro(int[] a, int[] b) {
        int l, i, j;
        l = a.length + b.length;
        int[] c;
        c = new int[l];
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (j = 0; j < b.length; j++) {
            c[i + j] = b[j];
        }
        return c;
    }

    // Anteriores
    public static boolean contiene(int[] a, int b) {
        boolean devuelve = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) devuelve = true;
        }
        return devuelve;
    }

    public static void escribeArray(int[] a) {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length - 1; i++) {
            System.out.print(a[i]);
            System.out.print(", ");
        }
        System.out.print(a[a.length - 1]);
        System.out.println("]");
    }

    public static void escribeArray2(double[] a) {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length - 1; i++) {
            System.out.printf("%.2f", a[i]);
            System.out.print(", ");
        }
        System.out.printf("%.2f", a[a.length - 1]);
        System.out.println("]");
    }

    public static void rellenaAleatorio2(int[] a, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(max - min + 1) + min;
        }
    }

    public static void rellenaAleatorio3(double[] a, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            double randomValue = min + (max - min) * r.nextDouble();
            a[i] = randomValue;
        }
    }

    public static int[] eliminaElementosArray(int[] a, int b) {
        int[] d;
        d = a;
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                d = elimina1ElementoArray(d, b);
            }
        }
        return d;
    }

    public static int maxArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int minArray(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}