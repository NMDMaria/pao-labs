package com.company.immutability;

import java.time.LocalDate;

public class Immutable {
    private LocalDate date;

    public Immutable(LocalDate date)
    {
        this.date = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
    }

    public LocalDate getDate()
    {
        return LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
    }
}
