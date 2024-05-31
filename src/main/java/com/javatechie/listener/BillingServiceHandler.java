package com.javatechie.listener;

import com.javatechie.events.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceHandler {
    @Async
    @EventListener
    public void processBill(PatientDischargeEvent event) {
        // Finalize billing details
        System.out.println("Billing Service: Finalizing bill for patient " + event.getPatientId()+" "+Thread.currentThread().getName());
    }
}
