package institut;

/**
 * Created by dell on 20/11/2019.
 */

public class Couers {
    public int cornum;
    public String corname;
    public String preas;
    public   int student;

    public Couers(int cornum, String corname, String preas, int student) {
        this.cornum = cornum;
        this.corname = corname;
        this.preas = preas;
        this.student = student;
    }

    public Couers() {
    }

    public int getCornum() {
        return cornum;
    }

    public void setCornum(int cornum) {
        this.cornum = cornum;
    }

    public String getCorname() {
        return corname;
    }

    public void setCorname(String corname) {
        this.corname = corname;
    }

    public String getPreas() {
        return preas;
    }

    public void setPreas(String preas) {
        this.preas = preas;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public String toString() {
        return
                "cornum=" + cornum +"\n"+
                " corname=" + corname + "\n"+
                " preas=" + preas +"\n" +
                " number student of cours="+student+"\n"
                ;
    }
}
