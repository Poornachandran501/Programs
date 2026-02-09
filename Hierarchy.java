package Coreproject;
public class Hierarchy {

    public static void main(String[] args) {

        classB obj1 = new classB();
        obj1.cse();

        classC obj2 = new classC();
        obj2.cse();
    }
}


class classA {
    public void cse() {
        System.out.println("CSE Department");
    }
}

class classB extends classA {
    public void cse() {
        System.out.println("IT Student");
    }
}

class classC extends classA {
    public void cse() {
        System.out.println("AI & DS Student");
    }
}

