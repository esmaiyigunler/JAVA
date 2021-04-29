package oopIntro;

public class MainOdev {

	public static void main(String[] args) {
           Courses kurs1=new Courses (1,"yazilim geliþtirme c","zeynep");
           
           Courses kurs2= new Courses();
           kurs2.id=2;
           kurs2.name="yazilim geliþtirme";
           kurs2.egitmen="engin demirog";
           
           Courses kurs3= new Courses();
           kurs3.id=3;
           kurs3.name="yazilim geliþtirme java";
           kurs3.egitmen="ufuk";
           
           
           
           
           
           
           
           
           
           Courses[] kurslar= {kurs1,kurs2,kurs3};
           
           for(Courses kurs:kurslar) {
        	   System.out.println(kurs.name);
           }
           
           System.out.println(kurslar.length);
           
           Category category1=new Category();
           category1.id=1;
           category1.name="yazilim gelistirme c#";
           
           Category category2= new Category();
           category2.id=2;
           category2.name="yazilim gelistirme";
           
           Category category3= new Category();
           category3.id=3;
           category3.name="yazilim gelistirme java";
           
           }

}
