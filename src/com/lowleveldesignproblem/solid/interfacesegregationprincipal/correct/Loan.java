package com.lowleveldesignproblem.solid.interfacesegregationprincipal.correct;

public interface Loan extends Payment {
    void initiateLoanSettlement();
    void initiateRePayment();
}