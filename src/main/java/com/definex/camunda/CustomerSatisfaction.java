package com.definex.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CustomerSatisfaction implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        execution.setVariable("customerSatisfied", Math.round(Math.random()) == 1 ? Boolean.TRUE : Boolean.FALSE);
    }
}
