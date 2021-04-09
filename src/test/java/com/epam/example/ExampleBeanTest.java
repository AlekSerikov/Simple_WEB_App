package com.epam.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleBeanTest {

    @Test
    public void getValueTest() {
        ExampleBean exampleBean = new ExampleBean(2);
        assertEquals("Values are not equals", exampleBean.getValue(), 2);
    }
}