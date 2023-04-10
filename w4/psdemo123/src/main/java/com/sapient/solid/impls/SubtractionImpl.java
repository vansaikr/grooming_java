package com.sapient.solid.impls;

import com.sapient.solid.facades.Operation;

public class SubtractionImpl implements Operation {
    @Override
    public int execute(int a, int b) {
        return (a-b);
    }
}
