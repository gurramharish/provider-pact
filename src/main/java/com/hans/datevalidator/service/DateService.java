package com.hans.datevalidator.service;

import com.hans.datevalidator.DateResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@Service
public class DateService {

    public DateResponse getValidDate(String date) {
        try {
            LocalDate localDate = LocalDate.parse(date);
            return new DateResponse(localDate.getYear(), localDate.getMonth().getValue(),
                    localDate.getDayOfMonth(), true, "Converted Successfully");
        } catch (DateTimeParseException e) {
            final DateResponse dateResponse = new DateResponse();
            dateResponse.setIsValidDate(false);
            dateResponse.setMessage("Conversion failed");
            return dateResponse;
        }
    }
}
