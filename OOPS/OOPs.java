package OOPS;

public class OOPs {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); //created a pen object called p1
        // p1.setcolor("blue");
        // p1.settip(5);
        // System.out.println(p1.color);
        // System.out.println(p1.tip);
        // // p1.setcolor("yellow");
        // p1.color = "yellow";
        // System.out.println(p1.color);

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "devanshupatil";
        // // myAcc.password = "qwerty";
        // myAcc.setpassword("qwerty");
        // Students s1  = new Students("devanshu");
        // s1.marks[0]=95;
        // s1.marks[1]=85;
        // s1.marks[2]=80;
        // Students s2  = new Students("devanshu");
        // Students s3  = new Students(123);
        // Students s4 = new Students(s1);
        // System.out.println(s4.name);
        // s1.marks[0]=95;
        // s1.marks[1]=85;
        // s1.marks[2]=100;
 

        // for (int i = 0 ; i<3 ; i++){
        //     System.out.println(s4.marks[i]);
        // }
       
        // Fish shark = new Fish();
        // shark.eats();;

        // Dog doggy = new Dog();
  
        // doggy.eats();
        // doggy.legs = 4;
        // // System.out.println(doggy.legs); 


        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(5, 10 , 15));
        // System.out.println(calc.sum(5.5f, 10.51f));
        // System.out.println(calc.sum(5, 10 ));

        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // chicken c = new chicken();
        // c.eat();
        // c.walk();

        Queen q = new Queen();
        q.moves();
}
    }

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        // compalsorily type public keywoard otherwise its type is default.
        System.out.println("up, down ,right, diagonal (in four direction)");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        // compalsorily type public keywoard otherwise its type is default.
        System.out.println("up, down ,right");
    }
}

class King implements Chessplayer{
    public void moves(){
        // compalsorily type public keywoard otherwise its type is default.
        System.out.println("up, down ,right, by 1 step");
    }
}


abstract class Animalss{
    void eat(){
        System.out.println("anmimals eats");
    }

    abstract void walk();
}

class Horse extends Animalss{
    void walk(){
        System.out.println(" walks on four legs");

    }


}

class chicken extends Animalss{
    void walk(){
        System.out.println(" walks on 2 legs");
    }
}



// method overloading // known at compile time 
// polymorphism
class Calculator{
    int sum(int a , int b){
        return a + b ;
    }
    float sum (float a, float b){
        return a+b;
    }
    int sum (int a , int b , int c){
        return a+b+c; 
    }
}




// base class or parent class
class Animals{
    String color;

    void eats(){
        System.out.println("eats");

    }
    void breaths(){
        System.out.println("breaths");
    }
}

class Mammals extends Animals {
    int legs;
    void walks(){
        System.out.println("walks");
    }
}

class Fishs extends Animals {
    
    void swims(){
        System.out.println("swimss");
    }
}
class Bird extends Animals {
    
    void fly(){
        System.out.println("flyyy");
    }
}


class Dog extends Mammals{
    String breed;
    void eats(){
        System.out.println("eats hotdog");
    }

}


// // derived class or child class or subclass
// class Fish extends Animals{
//     int fins;

//     void swims(){
//         System.out.println("it swims");
//     }
//     void speedofswims(){
//         System.out.println("i dont know but fish absolutly knows");
//     }
// }


class Students{
    String name;
    int rollno ;
    int marks[];

    Students(){
        marks = new int[3];
        System.out.println("constructor is called...");
        // non paramertized constructor
    }

    Students( String name ){
        this.name = name;
        marks = new int[3];
        //  paramerterized constructor
    }

    Students( int rollno){
        this.rollno = rollno;//  paramerterized constructor
    }

    // Students (Students s1){
    //     // copy constructors   shallow copy constructor
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     this.marks = s1.marks;
        
    // }

    Students (Students s1){
        // copy constructors   deep copy constructor
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for ( int i =0 ; i< marks.length ; i++){
            this.marks[i]= s1.marks[i];
        }
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setpassword (String pwd) {
        password = pwd;
    }
}

class Pen{
    String color;
    int tip;
    String getcolor() {
        return this.color;
    }
    void setcolor(String newcolor){
        color = newcolor;
    }

    void settip(int newtipsize){
        // tip = newtipsize;
        this.tip =newtipsize;
    }
}
