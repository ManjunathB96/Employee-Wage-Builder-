package com.bridgelabz.emplyeewagebuilderUC;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWageBuilder {

    private Company company;
    private int totalEmpWage;
    private int totalHours;
    private int totalDays;
    private List<Integer> dailyWage = new ArrayList<>();

    public EmployeeWageBuilder() {
    }

    public EmployeeWageBuilder(Company company, int totalEmpWage, int totalHours, int totalDays) {
        this.company = company;
        this.totalEmpWage = totalEmpWage;
        this.totalHours = totalHours;
        this.totalDays = totalDays;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public List<Integer> getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(List<Integer> dailyWage) {
        this.dailyWage = dailyWage;
    }

    @Override
    public String toString() {
        return "EmpWageBuilder{" +
                "company=" + company +
                ", totalEmpWage=" + totalEmpWage +
                ", totalHours=" + totalHours +
                ", totalDays=" + totalDays +
                ", dailyWage=" + dailyWage +
                '}';
    }
}
