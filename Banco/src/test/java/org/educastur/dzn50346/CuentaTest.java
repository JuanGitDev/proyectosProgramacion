package org.educastur.dzn50346;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @org.junit.jupiter.api.Test
    void getSaldo() {
        Cuenta cuenta = new Cuenta("F123456", 1000);
        assertEquals(1000, cuenta.getSaldo());
    }

    @org.junit.jupiter.api.Test
    void setSaldo() {
        Cuenta cuenta = new Cuenta("F123456", 1000);
        cuenta.setSaldo(2000);
        assertEquals(2000, cuenta.getSaldo());
    }

    @org.junit.jupiter.api.Test
    void ingresarDinero() {
        Cuenta cuenta = new Cuenta("F123456", 1000);
        cuenta.ingresarDinero(500);
        assertEquals(1500, cuenta.getSaldo());
    }

    @org.junit.jupiter.api.Test
    void extraerDinero() {
        Cuenta cuenta = new Cuenta("F123456", 1000);
        cuenta.extraerDinero(300);
        assertEquals(700, cuenta.getSaldo());
    }
}