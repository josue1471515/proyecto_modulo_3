package com.alenasoft.urbanager.resources.example.service;

import com.alenasoft.urbanager.api.Example;
import com.alenasoft.urbanager.resources.Operations.service.PrimeService;
import com.alenasoft.urbanager.resources.Operations.service.PrimeServiceImpl;
import com.alenasoft.urbanager.resources.example.dao.ExampleDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;


public class PrimeServiceImplTest {

    private final ExampleDao dao = Mockito.mock(ExampleDao.class);
    private final Example expected = new Example(1, "Test title", "Test Message");

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testIsPrimeNumberPrimeIsZero() {
        PrimeServiceImpl primeServiceImpl = new PrimeServiceImpl();
        String result = primeServiceImpl.isPrime(0);
        String expected = "FAIL";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIsPrimeNumberPrimeIsOne() {
        PrimeService primeServiceImpl = new PrimeServiceImpl();
        String result = primeServiceImpl.isPrime(1);
        String expected = "FAIL";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIsPrimeNumberIsPrime() {
        PrimeService primeServiceImpl = new PrimeServiceImpl();
        String result = primeServiceImpl.isPrime(13);
        String expected = "OK";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIsPrimeNumberIsNotPrime() {
        PrimeService primeServiceImpl = new PrimeServiceImpl();
        String result = primeServiceImpl.isPrime(14);
        String expected = "FAIL";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGenerateSeriePrimeIfNumberIsZeroReturnEmpty() {
        PrimeService primeServiceImpl = new PrimeServiceImpl();
        String result = primeServiceImpl.generateSeriePrime(0);
        String expected = "";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGenerateSeriePrimeIfNumberIsNumberNReturnNNumberPrimes() {
        PrimeService primeServiceImpl = new PrimeServiceImpl();
        String result = primeServiceImpl.generateSeriePrime(4);
        String expected = "2,3,5,7";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGenerateSeriePrimeIfNumberIsNumberNegativeNReturnFail() {
        PrimeService primeServiceImpl = new PrimeServiceImpl();
        String result = primeServiceImpl.generateSeriePrime(-4);
        String expected = "FAIL";
        assertThat(result).isEqualTo(expected);
    }


}
