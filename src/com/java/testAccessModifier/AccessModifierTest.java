package com.java.testAccessModifier;

import com.java.class32.ChaseBank;

public class AccessModifierTest {
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.withdraw(400);
        cb.deposit(1000);
    }
}
