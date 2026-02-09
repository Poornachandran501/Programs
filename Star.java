package Coreproject;
class StarPattern {
 void horizontal() {
 for(int i = 1; i <= 10; i++) {
System.out.print("* ");
        }
        System.out.println();
    }
 void vertical() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("*");
     }
    }
 void diagonal () {
	 for(int i = 1;i<=10;i++) {
		 System.out.println("*");
	 }
 }
   }
public class Star {
    public static void main(String[] args) {
        StarPattern obj = new StarPattern();
        obj.horizontal();
        obj.vertical();
        obj.diagonal();
        }
}
	
