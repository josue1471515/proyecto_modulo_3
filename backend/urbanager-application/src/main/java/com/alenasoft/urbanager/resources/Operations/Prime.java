package com.alenasoft.urbanager.resources.Operations;

public class Prime {

    private final String FAIL = "FAIL";

    public String holaMundo() {
        return "hola";
    }


    public String isPrime(int number) {

        String result = "";
        if (number == 0) {
            result = this.FAIL;
        }

        
        return result;
    }
}
