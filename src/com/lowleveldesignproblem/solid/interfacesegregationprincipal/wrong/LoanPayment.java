package com.lowleveldesignproblem.solid.interfacesegregationprincipal.wrong;

import java.util.ArrayList;
import java.util.List;

public class LoanPayment implements Payment {

    @Override
    public void initiatePayments() {

        // these have to be implemented , Even these are not needed here
         throw new UnsupportedOperationException("This is not a bank payment");
    }

    @Override
    public Object status() {
        // these have to be implemented , Even these are not needed here
        return null;
        // ...
    }

    @Override
    public List<Object> getPayments() {
        // these have to be implemented , Even these are not needed here
        return new ArrayList<>();
        // ...
    }

    @Override
    public void intiateLoanSettlement() {
        // ...
    }

    @Override
    public void initiateRePayment() {
        // ...
    }
}