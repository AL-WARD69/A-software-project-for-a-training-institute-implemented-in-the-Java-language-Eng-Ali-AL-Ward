package institut;

/**
 * Created by HP on 15/11/19.
 */

public class Emp extends Person{
    private String empnum;

 //   private Person data;
    private int sal;
    private Jop dept;

    public Emp(String jhk, String ytyt, String s, int i, String m, String s1, int i1, String werr, String ewrwe, int i2) {
    }

    public Emp(String name, String adders, String phon, int age, String sex, String empnum, Jop dept, int sal) {
        super(name, adders, phon, age, sex);
        this.empnum = empnum;
        this.dept = dept;
        this.sal = sal;
    }

    public String getEmpnum() {
        return empnum;
    }

    public void setEmpnum(String empnum) {
        this.empnum = empnum;
    }

    public Jop getDept() {
        return dept;
    }

    public void setDept(Jop dept) {
        this.dept = dept;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return     super.toString()+"\n"+
                "empnum=" + empnum + "\n"+
                " dept=" + dept +"\n"+
                " sal=" + sal+"\n";
    }
}
