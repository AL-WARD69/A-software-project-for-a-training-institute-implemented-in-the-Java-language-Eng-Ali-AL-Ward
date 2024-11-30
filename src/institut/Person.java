package institut;

/**
 * Created by dell on 20/11/2019.
 */

public class Person {
    private String name ,adders,phone;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String name, String adders, String phon, int age, String sex) {
        this.name = name;
        this.adders = adders;
        this.phone = phon;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdders() {
        return adders;
    }

    public void setAdders(String adders) {
        this.adders = adders;
    }

    public String getPhon() {
        return phone;
    }

    public void setPhon(String phon) {
        this.phone = phon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return
                 "name=" + name +"\n" +
                " adders=" + adders +"\n" +
                " phone=" + phone + "\n" +
                " age=" + age +"\n"+
                " sex=" + sex +"\n";
    }
}

