package com.example.smthtasksspringmvc;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

@Setter
@Getter
public class Record {
    private String item;
    private Double revenue;
    private Double cost;
    private BigDecimal profit;

    public Record(String item, Double revenue, Double cost) {
        this.item = item;
        this.revenue = revenue;
        this.cost = cost;
        this.profit = BigDecimal.valueOf(revenue - cost).setScale(0, RoundingMode.CEILING);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (!Objects.equals(item, record.item)) return false;
        if (!Objects.equals(revenue, record.revenue)) return false;
        if (!Objects.equals(cost, record.cost)) return false;
        return Objects.equals(profit, record.profit);
    }

    @Override
    public int hashCode() {
        int result = item != null ? item.hashCode() : 0;
        result = 31 * result + (revenue != null ? revenue.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (profit != null ? profit.hashCode() : 0);
        return result;
    }
}
