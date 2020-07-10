package com.iddlo.bookstore.util;

import java.util.Random;

public class IsbnGenerator implements NumberGenerator {
    @Override
    public String generateNumber() {
        return "15-5879-" + Math.abs(new Random().nextInt());
    }
}
