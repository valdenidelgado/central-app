package com.enterprise.example.staffs;

import com.enterprise.example.Identifier;

import java.util.Objects;
import java.util.UUID;

public class EmployeeID extends Identifier {

    private final String value;

    public EmployeeID(final String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static EmployeeID unique() {
        return EmployeeID.from(UUID.randomUUID());
    }

    public static EmployeeID from(final String id) {
        return new EmployeeID(id);
    }

    public static EmployeeID from(final UUID id) {
        return new EmployeeID(id.toString().toLowerCase());
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeID that = (EmployeeID) o;
        return Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
