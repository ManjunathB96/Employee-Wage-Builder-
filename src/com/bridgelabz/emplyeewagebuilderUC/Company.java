package com.bridgelabz.emplyeewagebuilderUC;

public class Company {
    private String companyName;
    private int workingDaysPerMonth;
    private int maxWorkingHours;
    private int empWagePerHour;

    public Company() {
    }

    public Company(String companyName, int workingDaysPerMonth, int maxWorkingHours, int empWagePerHour) {
        this.companyName = companyName;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.maxWorkingHours = maxWorkingHours;
        this.empWagePerHour = empWagePerHour;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getWorkingDaysPerMonth() {
        return workingDaysPerMonth;
    }

    public void setWorkingDaysPerMonth(int workingDaysPerMonth) {
        this.workingDaysPerMonth = workingDaysPerMonth;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public void setMaxWorkingHours(int maxWorkingHours) {
        this.maxWorkingHours = maxWorkingHours;
    }

    public int getEmpWagePerHour() {
        return empWagePerHour;
    }

    public void setEmpWagePerHour(int empWagePerHour) {
        this.empWagePerHour = empWagePerHour;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", workingDaysPerMonth=" + workingDaysPerMonth +
                ", maxWorkingHours=" + maxWorkingHours +
                ", empWagePerHour=" + empWagePerHour +
                '}';
    }
}
