package com.example.smthtasksspringmvc;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Employee {
    private String name;
    private int age;
    private String role;

    public Employee(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (!Objects.equals(name, employee.name)) return false;
        return Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
