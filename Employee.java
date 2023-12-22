package EmployeeAssingment;

class Employee {
    //nitelikler
    String name;
    double salary;
    int workHours; //haftalık çalışma saati
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if(this.salary < 1000) {
            return 0;
        } else {
            return (this.salary * 3) / 100;
        }
    }

    int bonus() {
        if (this.workHours > 40) {
            int extraHours = this.workHours - 40;
            return (extraHours) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int workingYear = 2021 - this.hireYear;
        if(workingYear < 10) {
            return (this.salary * 5) / 100;
        } else if(workingYear > 9 && workingYear < 20) {
            return (this.salary * 10) / 100;
        } else if(workingYear > 19) {
            return (this.salary * 15) / 100;
        }
        return 0;
    }

    void printEmployee() {
        System.out.println("######yeni işçi##########");
        System.out.println("adı: " + this.name);
        System.out.println("maaşı: " + this.salary);
        System.out.println("çalışma saati: " + this.workHours);
        System.out.println("işe giriş yılı: " + this.hireYear);
        System.out.println("vereceği vergi: " + tax());
        System.out.println("alacağı bonus: " + bonus());
        System.out.println("yıla göre yapılacak maaş artışı: " + raiseSalary());
        System.out.println("vergi ve bonnuslar ile birlikte maaşı: " + (this.salary - tax() + bonus()));
        System.out.println("toplam maaş: " + (this.salary + bonus() + raiseSalary() - tax()));
    }






}
