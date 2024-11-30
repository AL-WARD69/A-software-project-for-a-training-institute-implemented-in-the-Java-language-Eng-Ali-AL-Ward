package institut;

/**
 * Created by dell on 20/11/2019.
 */
public class Jop {

    public int deptnum;
   public String deptname,typejop;

    public Jop() {
    }

    public Jop(int deptnum, String deptname, String typejop) {
        this.deptnum = deptnum;
        this.deptname = deptname;
        this.typejop = typejop;
    }

    public int getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(int deptnum) {
        this.deptnum = deptnum;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getTypejop() {
        return typejop;
    }

    public void setTypejop(String typejop) {
        this.typejop = typejop;
    }

    @Override
    public String toString() {
        return
                "deptnum=" + deptnum +"\n"+
                " deptname=" + deptname + "\n" +
                " typejop=" + typejop + "\n"
                ;
    }
}
