package com.lowleveldesignproblem.solid.interfacesegregationprincipal.correct;

public interface Bank extends Payment {
    void initiatePayments();
}