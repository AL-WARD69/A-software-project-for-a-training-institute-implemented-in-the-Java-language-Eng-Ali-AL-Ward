package institut;

import java.util.AbstractList;
import java.util.Scanner;

/**
 * Created by dell on 20/11/2019.
 */
public class TistMain {
    public static void main(String[] args) {
        Scanner ali=new Scanner(System.in);


        Couers C=new Couers(12,"ENGLECH","75757",20);

        Couers M=new Couers(22,"TTTTTTTT","7584849949",20);

        Student K=new Student("MALEK","ALTWQI","32424",20,"M","1111","MORNING","LELV2",C);

        Student Z=new Student("IGIUG","HJJK","32424",56,"M","4444","MORNING","LELV7",M);

        Student N=new Student("WER","ERUKGF","34534",28,"M","3333","NAINGHT","LELV1",M);
        Student O=new Student("ALI","WERWE","3242",30,"M","2222","MORNING","LELV3",C);





        Jop D=new Jop(11,"IT","TECHER");
        Jop F=new Jop(10,"IS","MANGER");
        Emp A=new Emp("DGYCDG","SHOB","773528949",40,"M","58577",D,20000);
        Emp E=new Emp("UTJHFJ","NGOM","773528949",25,"F","68768",F,25000);
        Emp P=new Emp("BNMHG","SAON","773528949",20,"M","87578",D,30000);




    Institut yali=new Institut("yali");
        yali.Abbstudent(O);
        yali.Abbstudent(K);
        yali.Abbstudent(N);
        yali.Abbstudent(Z);
        yali.AbbEmp(E);
        yali.AbbEmp(A);
        yali.AbbEmp(P);

        System.out.println( yali.displeyAlldetils());
      //  System.out.println("******************");
        System.out.println(yali.displeystudent());

        // System.out.println("******************");
        System.out.println(yali.displeyEmp());

        System.out.println("ابحث رقم الموظف");
        String x=ali.next();
        yali.ali(x);
    }
}
