public class Waiter extends Employee implements Comparable<Waiter> {
    private int tblServed;
    private boolean serving;

    public Waiter(){

    }


    public Waiter(int empNum, String empName, String empAddress, boolean serving, int tblServed) {
        super(empNum, empName, empAddress);
        this.serving = serving;
        this.tblServed = tblServed;
    }

    @Override
    public String toString() {
        return "Waiter{" +super.getEmpName()+
                " tblServed=" + tblServed +
                ", serving=" + serving +
                '}';
    }

    @Override
    public int compareTo(Waiter o) {

         if(this.getEmpNum()>o.getEmpNum())
            return 1;
        else
            return -1;

    }
}
