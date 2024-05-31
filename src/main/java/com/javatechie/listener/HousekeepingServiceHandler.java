package com.javatechie.listener;

import com.javatechie.events.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HousekeepingServiceHandler {
    @Async
    @EventListener
    public void cleanAndAssign(PatientDischargeEvent event) {
        // Prepare the room for the next patient
        System.out.println("Housekeeping Service: Preparing room for next patient after discharge of " + event.getPatientId()+" "+Thread.currentThread().getName());
    }
}
