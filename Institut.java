package institut;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dell on 20/11/2019.
 */
public class Institut {
    private ArrayList<Person> theperson=new ArrayList<Person>();
    private ArrayList<Student>theStudent=new ArrayList<Student>();
    private ArrayList<Emp>theEmp=new ArrayList<Emp>();
    Scanner in=new Scanner(System.in);
    private String Institutname;
    private int studentnum=0;
    private int Empnum=0;

    public Institut(String Institutname) {
        this.Institutname = Institutname;
    }

    public void setInstitutname(String Institutname) {
        this.Institutname = Institutname;
    }

    public String getInstitutname() {
        return Institutname;
    }

    public int getStudentnum() {
        return studentnum;
    }

    public int getEmpnum() {
        return Empnum;
    }

    public boolean Abbstudent(Student newstudent){
        theperson.add(newstudent);
        studentnum++;
        return true;
    }
    public boolean AbbEmp(Emp newEmp){
        theperson.add(newEmp);
        Empnum++;
        return true;
    }
    public String displeyAlldetils(){
        System.out.println("\n***************************************\n");
        System.out.println("\n*******informeshion BOUT Institut*******\n");
        System.out.println("\n***************************************\n");
        String inf="\nInstitutname:"+Institutname+"\n"+
                "\n Empnum:"+Empnum+"\n"+
                "\n EMP informeshion"+"\n";

        String inf1= "\n Studentnum:"+studentnum+"\n"+
                "\n Student informeshion"+"\n";

        for(Person i:theperson)
            if(i instanceof Emp)
                inf+=i.toString()+"\n----------------------------------------\n";
            else
                inf1+=i.toString()+"\n---------------------------------------\n";

        return inf+inf1 ;
    }
    public void ali(String S){
        for (int i=0;i<theEmp.size();i++){
        String t = in.next();
        if (theEmp.get(i).equals(t)){
            System.out.println(Empnum);
        }

    }}

    public String displeyEmp(){
        System.out.println("\n***************************************\n");
        System.out.println("\n******informeshion BOUT EMPLEOYEE******\n");
        System.out.println("\n***************************************\n");
        String inf="\nInstitutname:"+Institutname+"\n"+
                "\n Emp num:"+Empnum+"\n"+
                "\n Emp informeshion"+"\n";
        for(Person i:theperson)
            if(i instanceof Emp)
                inf+=i.toString()+"\n----------------------------------------\n";

        return inf;
    }
    public String displeystudent() {
        System.out.println("\n***************************************\n");
        System.out.println("\n******informeshion BOUT STUDENT******\n");
        System.out.println("\n***************************************\n");
        String inf1 ="\nInstitutname:"+Institutname+"\n"+
                "\n Studentnum:" + studentnum +"\n"+
                "\n Student informeshion"+"\n";

        for (Person i : theperson)
            if (i instanceof Student)
                inf1+= i.toString() + "\n---------------------------------------\n";

        return inf1;
    }
}