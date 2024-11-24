package Task3;

public class Base {
    void  show(){
        System.out.println("Base show");
    }
    static void display(){
        System.out.println("Base display");
    }

}
 class Derived extends Base {
    @Override
    void  show(){
        System.out.println("Derived show");
    }

    static void  display(){
        System.out.println("Derived display");

    }

     public static void main(String[] args) {
         Base obj = new Derived();
         obj.show();
         obj.display();
     }
     // obj.show() metodu cagirildiqda override olundugu ucun Derived classinin metodu
     // display metodu hide olur override olmur deye referance tip Base nezere alinir
}
