package com.hans.datevalidator;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DateResponse {

//    private String givenDate;
    private int year;
    private int month;
    private int day;
    private Boolean isValidDate = false;
    private String message;
}
