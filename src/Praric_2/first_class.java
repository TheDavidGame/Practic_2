package Praric_2;
import java.util.Scanner;

    class Shape{
    private String color = "white";
    private String form = "sphere";

    public String toString() {
        return color;
    }
    public String GetForm(){
        return form;
    }
}
    class Ball{
        private String shape = "sphere";
        private int R = 1;
        private final double PI = 3.14;

        public void setR(int R){
            this.R = R;
        }

        public String getShape() {
            return shape;
        }

        public double Square(){
            double S = 4 * PI * (R * R);
            return S;
        }
        public double Square(int R){
            double S = 4 * PI * (R * R);
           return S; //Можно ли тут упростить ?
        }

    }
    class Book{
        private String cover = "red";
        private int number_pages ;

        public void setCover(String cover) {
            this.cover = cover;
        }

        public void setNumber_pages(int number_pages) {
            this.number_pages = number_pages;
        }

        public int getNumber_pages() {
            return number_pages;
        }

        public String getCover() {
            return cover;
        }

    }
    class Dog{
        public String name;
        private int age;

        public Dog(int age,String name) {
            this.age = age * 7;
            this.name = name;
        }

        public String toString() {
            return "Dog: " +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ' ';
        }

    }
    class Dog_kennel{
         public void addDogs(int n,Dog ... N){

            for(int i = 0;i < n;i++){
                System.out.print(N[i] + " ");
            }
        }
    }

public class first_class {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /////////Task 1////////
        Shape c1 = new Shape();
        System.out.println(c1.GetForm());
        System.out.println("/////////////////");
        /////////Task 2////////

        Ball c2 = new Ball();
        System.out.println(c2.getShape());
        System.out.println(c2.Square(2));
        c2.setR(5);
        System.out.println(c2.Square());

        System.out.println("/////////////////");
        /////////Task 3////////
        Book c3 = new Book();
        c3.setCover("Green");
        System.out.println(c3.getCover());
        c3.setNumber_pages(133);
        System.out.println(c3.getNumber_pages());
        System.out.println("/////////////////");
        /////////Task 4////////
        Dog c4 = new Dog(2,"Bobick");
        System.out.println(c4.toString());

        Dog c5 = new Dog(3,"Sharik");
        Dog c6 = new Dog(2,"Hatiko");

        Dog_kennel c7 = new Dog_kennel();
        c7.addDogs(3,c4,c5,c6);
    }


}

