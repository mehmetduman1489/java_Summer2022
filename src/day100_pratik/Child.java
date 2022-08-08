package day100_pratik;

public class Child extends BParent {
    protected String isim = "Child ismi belirtilmrdi";
    protected String ChildKulupAdi = "Child Kulubü";

    Child() {
        System.out.println("Child constructor calıstı");
    }

    public static void main(String[] args) {
        AGrandParent gp1=new AGrandParent();

    }
}
