package institut;

import java.util.Arrays;

/**
 * Created by HP on 15/11/19.
 */
public class Regstar {
    private Student[] thestudent;
    private Couers couersname;
    private Float degrey;

    public Regstar(Student[] thestudent, Couers couersname, Float degrey) {
        this.thestudent = thestudent;
        this.couersname = couersname;
        this.degrey = degrey;
    }

    public Regstar() {
    }

    public Student[] getThestudent() {
        return thestudent;
    }

    public void setThestudent(Student[] thestudent) {
        this.thestudent = thestudent;
    }

    public Couers getCouersname() {
        return couersname;
    }

    public void setCouersname(Couers couersname) {
        this.couersname = couersname;
    }

    public Float getDegrey() {
        return degrey;
    }

    public void setDegrey(Float degrey) {
        this.degrey = degrey;
    }


    public String toString() {
        return
                "thestudent=" + Arrays.toString(thestudent) +"\n"+
                " couersname=" + couersname +"\n"+
                " degrey=" + degrey +"\n";
    }
}
