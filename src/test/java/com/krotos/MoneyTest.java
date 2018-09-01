package com.krotos;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    Money money;
    double delta=0.0001;

    @BeforeEach
     public void before(){
        money=new Money(Currency.EUR,2.344f);
    }

    @Test
    public void toStringTest(){
        assertEquals("EUR 2.34",money.toString());
    }


    @Test
    public void getCurrency() {
        assertEquals(Currency.EUR,money.getCurrency());
    }

    @Test
    public void getValue() {
        assertEquals(2.344,money.getValue(),delta);
    }
    @Test
    public void equals(){
        Money money2=new Money(Currency.EUR,2.344f);
        Money money3=new Money(Currency.USD,4.55f);

        assertTrue(money.equals(money2));
        assertFalse(money.equals(money3));
    }
    @Test
    public void parse(){
        Money newMoney=Money.parse("PLN 23.098");
        assertEquals("PLN 23.10",newMoney.toString());
        assertEquals(23.098,newMoney.getValue(),delta);
    }
    @Test
    public void convert(){
        Money newMoney=money.convert(Currency.PLN);
        assertEquals(Currency.PLN,newMoney.getCurrency());
        assertEquals(10.1037,newMoney.getValue(),delta);
    }
}