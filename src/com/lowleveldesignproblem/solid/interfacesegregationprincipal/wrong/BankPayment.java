package com.lowleveldesignproblem.solid.interfacesegregationprincipal.wrong;

import java.util.ArrayList;
import java.util.List;

public class BankPayment implements Payment {

    @Override
    public void initiatePayments() {
       // ...
    }

    @Override
    public Object status() {
        return null;

        // ...
    }

    @Override
    public List<Object> getPayments() {
        return new ArrayList<>();
    }

    @Override
    public void intiateLoanSettlement() {
        // these have to be implemented , Even these are not needed here
    }

    @Override
    public void initiateRePayment() {
        // these have to be implemented , Even these are not needed here
    }
}