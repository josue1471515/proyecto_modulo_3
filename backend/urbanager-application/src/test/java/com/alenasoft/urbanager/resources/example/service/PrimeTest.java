package com.alenasoft.urbanager.resources.example.service;

import com.alenasoft.urbanager.api.Example;
import com.alenasoft.urbanager.resources.Operations.Prime;
import com.alenasoft.urbanager.resources.example.dao.ExampleDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;


public class PrimeTest {

    private final ExampleDao dao = Mockito.mock(ExampleDao.class);
    private final Example expected = new Example(1, "Test title", "Test Message");

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testNumberPrimeIsZero() {
        Prime prime = new Prime();
        String result = prime.isPrime(0);
        String expected = "FAIL";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testNumberPrimeIsOne() {
        Prime prime = new Prime();
        String result = prime.isPrime(1);
        String expected = "FAIL";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testNumberIsPrime() {
        Prime prime = new Prime();
        String result = prime.isPrime(13);
        String expected = "OK";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testNumberIsNotPrime() {
        Prime prime = new Prime();
        String result = prime.isPrime(14);
        String expected = "FAIL";
        assertThat(result).isEqualTo(expected);
    }
    
}
