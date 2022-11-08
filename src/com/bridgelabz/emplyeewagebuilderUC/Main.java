package com.bridgelabz.emplyeewagebuilderUC;

import java.util.Scanner;

public class Main {
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_DAY_HOUR = 4;

    private static Employeewage companyEmpWage = new Employeewage();

    public static EmployeeWageBuilder computeEmployeeWage(Company company) {
        int days = 0;
        int empHours = 0;
        EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
        while (days < company.getWorkingDaysPerMonth() && empHours <= company.getMaxWorkingHours()) {
            int todayEmpWage = 0;
            days++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 0:
                    todayEmpWage = FULL_DAY_HOUR;
                    break;
                case 1:
                    todayEmpWage = PART_DAY_HOUR;
                    break;
                case 2:
                    todayEmpWage = 0;
                    break;
            }
            empHours = empHours + todayEmpWage;
            empWageBuilder.getDailyWage().add(todayEmpWage * company.getEmpWagePerHour());
        }
        int totalEmpWage = empHours * company.getEmpWagePerHour();

        empWageBuilder.setCompany(company);
        empWageBuilder.setTotalHours(empHours);
        empWageBuilder.setTotalDays(days);
        empWageBuilder.setTotalEmpWage(totalEmpWage);
        companyEmpWage.getEmpWageBuilderList().add(empWageBuilder);
        return empWageBuilder;
    }

    public static void main(String[] args) {
        Company infosys = new Company("Infosys", 20, 90, 40);
        Company intellect = new Company("Intellect", 15, 80, 25);
        Company finTech = new Company("FINTECH", 26, 100, 25);
        computeEmployeeWage(infosys);
        computeEmployeeWage(intellect);
        computeEmployeeWage(finTech);
        for (int i = 0; i < companyEmpWage.getEmpWageBuilderList().size(); i++) {
            System.out.println(companyEmpWage.getEmpWageBuilderList().get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the company name to get details of wage: ");
        String companyName = scanner.nextLine();
        boolean isCompanyFound = false;
        for (int i = 0; i < companyEmpWage.getEmpWageBuilderList().size(); i++) {
            if (companyEmpWage.getEmpWageBuilderList().get(i).getCompany().getCompanyName().equals(companyName)) {
                System.out.println("Found company and here are the details");
                System.out.println(companyEmpWage.getEmpWageBuilderList().get(i));
                isCompanyFound = true;
                break;
            }
        }
        if (!isCompanyFound) {
            System.out.println("Not found any record with : " + companyName);
        }
    }
}
