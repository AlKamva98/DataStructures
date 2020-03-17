public class Chef extends Employee {

    private int mealsPreped;
    private String meal;

    public Chef() {

    }

    public Chef(int empNum, String empName, String empAddress, int mealsPreped, String meal) {
        super(empNum, empName, empAddress);
        this.mealsPreped = mealsPreped;
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "Chef{"  +super.getEmpName()+
                " mealsPreped=" + mealsPreped +
                ", meal='" + meal + '\'' +
                '}';
    }
}
