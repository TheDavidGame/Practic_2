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
    }


}

