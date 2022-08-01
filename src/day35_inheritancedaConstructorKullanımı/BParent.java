package day35_inheritancedaConstructorKullanımı;


public class BParent extends AGrandParent{
    protected String isim="Parent isim belirtilmedi";
    protected String parentKlupAdi="Parent Klubu";
    BParent(){
        System.out.println("Parent constructor calisti");
    }
}