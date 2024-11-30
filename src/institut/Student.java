package institut;

/**
 * Created by HP on 15/11/19.
 */
   public class Student extends Person {
    private String sutnum,time,lave;
    public Couers C;

    public Student(String name, String adders, String phon, int age, String sex, String sutnum, String time, String lave, Couers c) {
        super(name, adders, phon, age, sex);
        this.sutnum = sutnum;
        this.time = time;
        this.lave = lave;
        C = c;
    }

    public Student(String next, String s, String next1, int i, String m, String s3, String s1, String next2, int i1, String s2, String next3, int i2) {
    }

    public String getSutnum() {
        return sutnum;
    }

    public void setSutnum(String sutnum) {
        this.sutnum = sutnum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLave() {
        return lave;
    }

    public void setLave(String lave) {
        this.lave = lave;
    }

    public Couers getC() {
        return C;
    }

    public void setC(Couers c) {
        C = c;
    }

    @Override
    public String toString() {
        return   super.toString()+"\n"+
                "sutnum=" + sutnum + '\n' +
                " time=" + time + '\n' +
                " lave=" + lave + '\n' +
                " CORS=" + C;
    }
    /* @Override
    public String toString() {
        return "Stutdent{" +
                "name"+getName()+"/n"+
                "adders"+ getAdders()+"/n"+
                "phon"+getPhon()+"/n"+
                "age"+getAge()+"/n"+
                "sex"+getSex()+"/n"+
                "sutnum='" + sutnum + '\'' +
                ", time='" + time + '\'' +
                ", lave='" + lave + '\'' +
                ", C=" + C.toString() +
                '}';*/
    }


