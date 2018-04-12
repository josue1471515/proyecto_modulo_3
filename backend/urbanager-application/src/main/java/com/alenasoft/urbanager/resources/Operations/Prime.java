package com.alenasoft.urbanager.resources.Operations;

public class Prime {

    private final String FAIL = "FAIL";
    private final String OK = "OK";
    private final String EMPTY = "";

    public String holaMundo() {
        return "hola";
    }


    public String isPrime(int number) {


        if (number == 0) {
            return this.FAIL;
        }

        if (number == 1) {
            return this.FAIL;
        }
        int contadorPrimo = 0;
        for (int i = 1; number >= i; i++) {
            if (number % i == 0) {
                contadorPrimo += 1;
            }
        }
        if (contadorPrimo == 2) {
            return this.OK;
        } else {
            return this.FAIL;
        }
    }


    public String generateSeriePrime(int number) {

        if (number == 0) {
            return this.EMPTY;
        }
        String result = "";
        int i = 2;
        while (true) {
            if (isPrime(i).equals(this.OK)) {
                number--;
                result += String.format("%s,",i);
            }
            if (number==0){
                result = result.substring(0,result.length()-1);
                break;
            }
            i++;
        }
        return result;
    }
}
