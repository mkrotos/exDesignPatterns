package com.krotos;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    Money money;

    @BeforeEach
     public void before(){
        money=new Money(Currency.EUR,2.344f);
    }

    @Test
    public void toStringTest(){
        assertEquals("EUR 2.34",money.toString());
    }

}