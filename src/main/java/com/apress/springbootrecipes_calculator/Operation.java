package com.apress.springbootrecipes_calculator;

public interface Operation {
    int apply(int lhs, int rhs);
    boolean handles(char op);
}
