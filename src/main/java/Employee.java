public class Employee {

    private int empNum;
    private String empName;
    private String empAddress;

    public Employee() {
    }

    public Employee(int empNum, String empName, String empAddress) {
        this.empNum = empNum;
        this.empName = empName;
        this.empAddress = empAddress;
    }
     public void setEmpNum(int empNum){
        this.empNum = empNum;
     }
     public int getEmpNum(){
        return empNum;
     }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

}
