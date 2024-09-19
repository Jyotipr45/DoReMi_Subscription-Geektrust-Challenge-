package com.geektrust.backend.services;

import com.geektrust.backend.dto.RenewalAmountDto;
import com.geektrust.backend.dto.RenewalReminderDto;
import com.geektrust.backend.exceptions.SubscriptionNotFoundException;

import java.util.List;

public interface IRenewalService {

    /**
     * Calculates a list of renewal reminders for subscriptions.
     * @return A list of renewal reminder data transfer objects (DTOs).
     * @throws SubscriptionNotFoundException If no subscriptions are found.
     */
    List<RenewalReminderDto> calculateListOfRenewalDateOfSubscriptions() throws SubscriptionNotFoundException;

    /**
     * Calculates the total renewal amount for all subscriptions.
     * @return A data transfer object (DTO) containing the renewal amount details.
     */
    RenewalAmountDto calculateRenewalAmount();
}
