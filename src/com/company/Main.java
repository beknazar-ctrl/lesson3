package com.company;


public class Main {

    public static void main(String[] args) {
        boolean firstNegNum = false;

        double summa = 0;
        double razmerMassiva = 0;
        double arithmeticMean;
        double[] numbers = {1.2, -1.3, 1.4, -1.5, 1.6, -1.7, 1.8, -1.9, 2.1, -2.2, 2.3, -2.4, 2.5, -2.6, 2.7};
        for (double mT : numbers) {
            if (!firstNegNum && mT < 0) {
                firstNegNum = true;
                continue;
            }
            if (firstNegNum && mT > 0) {
                summa = summa + mT;
                razmerMassiva++;
            }
        }

        arithmeticMean = summa / razmerMassiva;
        System.out.println("Среднее арифметическое: " + arithmeticMean);

    }
}
