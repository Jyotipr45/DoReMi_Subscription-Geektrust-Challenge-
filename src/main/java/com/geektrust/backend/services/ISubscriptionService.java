package com.geektrust.backend.services;

import com.geektrust.backend.enums.SubscriptionCategory;
import com.geektrust.backend.enums.SubscriptionPlan;
import com.geektrust.backend.enums.DeviceType;
import com.geektrust.backend.exceptions.AddSubscriptionFailedException;
import com.geektrust.backend.exceptions.AddTopUpFailedException;
import com.geektrust.backend.exceptions.InvalidDateException;

public interface ISubscriptionService {

    /**
     * Starts a subscription for a user based on the provided date.
     * @param dateStr The start date of the subscription in string format (e.g., "YYYY-MM-DD").
     * @throws InvalidDateException If the provided date is invalid or cannot be parsed.
     */
    void startSubscriptionForUser(String dateStr) throws InvalidDateException;

    /**
     * Adds a subscription to a user's account.
     * @param subscriptionCategory The category of the subscription (e.g., MUSIC, VIDEO, PODCAST).
     * @param subscriptionPlan The plan of the subscription (e.g., FREE, PERSONAL, PREMIUM).
     * @throws AddSubscriptionFailedException If the subscription cannot be added due to an error.
     */
    void addSubscriptionForUser(SubscriptionCategory subscriptionCategory, SubscriptionPlan subscriptionPlan) 
            throws AddSubscriptionFailedException;

    /**
     * Adds a top-up to a user's account for additional devices.
     * @param deviceType The type of device for which the top-up is being added (e.g., TEN_DEVICE, FOUR_DEVICE).
     * @param noOfDays The number of days for which the top-up is valid.
     * @throws AddTopUpFailedException If the top-up cannot be added due to an error.
     */
    void addTopUpForUser(DeviceType deviceType, Integer noOfDays) throws AddTopUpFailedException;
}
