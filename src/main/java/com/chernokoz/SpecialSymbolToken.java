package com.chernokoz;

public class SpecialSymbolToken implements Token {

    Character symbol;

    public String getToken() {
        return String.valueOf(symbol);
    }

    public SpecialSymbolToken(char symbol) {
        this.symbol = symbol;
    }
}
