package com.lowleveldesignproblem.solid.interfacesegregationprincipal.correct;

import java.util.List;

public interface Payment {
    Object status();
    List<Object> getPayments();
}