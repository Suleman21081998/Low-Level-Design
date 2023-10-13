package com.lowleveldesignproblem.solid.interfacesegregationprincipal.wrong;

import java.util.List;

public interface Payment {
    void initiatePayments();
    Object status();
    List<Object> getPayments();
    void intiateLoanSettlement();
    void initiateRePayment();
}
