package ru.raiffeisen.cources.atm;

import ru.raiffeisen.cources.atm.model.money.Money;
import ru.raiffeisen.cources.atm.model.score.DumpType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    ATM atm = new ATM();
        atm.dump(DumpType.JSON);
        atm.restore(DumpType.JSON);
    }
}
