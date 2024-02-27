
public class Brocode {
    public static void main(String[] args) {
        //JPanel = a GUI component that functions as a container to hold other component

    }
}


















/*import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Brocode {
    public static void main(String[] args) {

        ImageIcon img = new ImageIcon("RITIKESH MACHHEWAR.png");
        Border border = BorderFactory.createLineBorder(Color.black,3);

        JLabel lb = new JLabel("do you code");
        //lb.setText("do you code");
        lb.setIcon(img);
        lb.setHorizontalTextPosition(JLabel.CENTER);
        lb.setVerticalTextPosition(JLabel.TOP);
        lb.setForeground(Color.black);
        lb.setFont(new Font("MV Boli",Font.PLAIN,50));
        lb.setIconTextGap(2);
        lb.setBackground(Color.CYAN);
        lb.setOpaque(true);
        lb.setBorder(border);
        lb.setVerticalAlignment(JLabel.CENTER);
        lb.setHorizontalAlignment(JLabel.CENTER);
        //lb.setBounds(100,100,500,500 );




        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //fr.setSize(500,500);
        //fr.setLayout(null);
        fr.setVisible(true);
        fr.getContentPane().setBackground(new Color(123,50,250));
        fr.add(lb);
        fr.pack();
    }
}




*/





/*import javax.swing.*;
import java.awt.*;

public class Brocode {
    public static void main(String[] args) {
        new MyFrame();
    }



}

class MyFrame extends JFrame{
    MyFrame(){


        this.setVisible(true);
        this.setSize(420,420);
        this.setTitle("Ritikesh");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);

        ImageIcon img = new ImageIcon("RITIKESH MACHHEWAR.png");

        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));//or (new Color(0,0,0));  //Color.cyan

    }
}





*/



/*import javax.swing.*;
import java.awt.*;

public class Brocode {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components

        JFrame fr = new JFrame();

        fr.setVisible(true);
        fr.setSize(420,420);
        fr.setTitle("Ritikesh");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(true);

        ImageIcon img = new ImageIcon("RITIKESH MACHHEWAR.png");

        fr.setIconImage(img.getImage());
        fr.getContentPane().setBackground(new Color(123,50,250));//or (new Color(0,0,0));  //Color.cyan

    }
}



*/






















/*
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Brocode {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            File file = new File("E:\\brocode java tutorial\\El Billete - Edgar Lopez and Quincas Moreira.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equalsIgnoreCase("q")) { // Loop until user quits
                System.out.println("p = play, s = stop, r = reset, q = quit");
                System.out.println("Enter your choice: ");

                response = scanner.next().toUpperCase(); // Convert input to uppercase

                switch (response) {
                    case "P":
                        clip.start();
                        break;
                    case "S":
                        clip.stop();
                        break;
                    case "R":
                        clip.setMicrosecondPosition(0); // Reset to beginning
                        break;
                    case "Q":
                        System.out.println("Quitting...");
                        break;
                    default:
                        System.out.println("Invalid response. Please try again.");
                }
            }

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Error playing audio: " + e.getMessage());
        }
    }
}


*/























/*import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Brocode {
    public static void main(String[] args) {
        //filereader = read contest of file as a stream of charcters one by one
        //              read() returns an int value which contains the byte value
        //              when read() returns -1, there is no more data to be read
        try {
            FileReader reader = new FileReader("secret message.text");
            int data = reader.read();
            while(data != -1){
                System.out.println((char) data);
                data = reader.read();
            }
            reader.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}



*/







/*import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Brocode {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("secret message.text");
            writer.write("roses are red \n voilates are blue \n now go home");
            writer.append("\n(a peam by Ritikesh)");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
}*/



















/*import java.io.File;
public class Brocode {
    public static void main(String[] args) {
        //file = an abstract representation  of file and directory path names
        File file = new File("secret message.txt");//C:\Users\hp\OneDrive\Desktop

         if(file.exists()){
            System.out.println("yes this file exist ");
                System.out.println(file.getPath());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.isFile());
                file.delete();
        }
        else {
            System.out.println("file does not exist");
        }
    }
}
*/









/*
import java.util.InputMismatchException;
import java.util.Scanner;

//Brocode
public class Brocode {
    //exception handling:- an event that occurs during the execution of program that, disrupts flow of instructions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

        System.out.println("whole num to divide");
        int x = scanner.nextInt();

        System.out.println("whole num to divide");
        int y = scanner.nextInt();

        int z = x/y;
        System.out.println("result: "+z);
        }
        catch (ArithmeticException e){
            System.out.println("you can't divide by zero");
        }
        catch (InputMismatchException e) {
            System.out.println("please enter valid number");
        }
        catch (Exception e){
            System.out.println("somthing went wrong");
        }
        finally {
            scanner.close();
            //System.out.println("this will always print");
        }
    }
}
*/

/*

import java.util.Scanner;

public class Brocode {
    //dynamic polymorphism = many shapes/forms
//dynamic = after complition (during runtime)
//ex. A corvette is a : corvette and a car , and a vehicle , and an object
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Animal animal;
        System.out.println("which animal");
        System.out.println("(1 - dog ) or (2 - cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if ((choice == 2)) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("this choice is not valid in 4");
            animal.speak();
        }

    }

}
    class Animal {
        public void speak() {
            System.out.println("animal sound");
        }
    }

    class Dog extends Animal {
        @Override
        public void speak() {
            System.out.println("bouuu");
        }
    }

    class Cat extends Animal {
        @Override
        public void speak() {
            System.out.println("meaww");
        }
    }


*/







/*
// encapsulation in java = attributes of class will be hidden or private,
//                          can be accessed only through methods(getters & setters)
//                          You should make attribute private if you don't have a reason to mek them public / protected


public class Brocode {
    public static void main(String[] args) {
        Car car = new Car("marsidiz ", "comaro" , 34);


        car.setAge(2022);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getAge());
    }


}
class Car {
    private String  make;
    private String model;
    private int age;
    Car(String make , String model , int age){
        this.setMake(make);
        this.setMake(model);
        this.setAge(age);
        //this.make = make;
        //this.model = model;
        //this.age = age;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getAge(){
        return age;
    }
    void setMake(String make){
        this.make = make;
    }
    void  setModel(String model){
        this.model = model;
    }
    void setAge(int age){
        this.age = age;
    }
}




*/













/*//abstraction : - abstract classes cannot be instantiated , nut they can have a subclas
//              - abstract methods are declared without an implementation
public class Brocode {
    public static void main(String[] args) {
       //Vehicle vehicle = new Vehicle(); - you cannot do this in this
        Car car = new Car();
        car.go();
    }
}
class Car extends Vehicle{
    @Override
    void go() {
        System.out.println("the driver is driving the car ");
    }
}
abstract class Vehicle{
    abstract void go();
}
*/


















/*
// super keyword :-
 public class Brocode {
    public static void main(String args[]){
        Hero hero1 = new Hero("luffy",17,"stretching");
        Hero hero2 = new Hero("zoro" ,27,"swardsanship");
        System.out.println(hero2);
        System.out.println(hero1);

    }
}
  class peron {
    String name;
    int age;
    peron(String name,int age){
        this.name = name;
        this.age = age;

    }
    public String toString(){
        return this.name + "\n" + this.age +"\n";

    }
}

class Hero extends peron{
    String power;
    Hero(String name , int age, String power){
        super(name,age);
        this.power = power;
    }
    public String toString(){
        return super.toString()+this.power;
    }
}



*/
















/*public class Brocode {
    public static void main(String[] args) {
        Animal myAnimal = new dog();
        doAnimalStuff(myAnimal);
    }
    public static void doAnimalStuff(Animal animal){
        animal.makenoise();
    }
}


class dog extends Animal{
   public void makenoise(){
       System.out.println("woof woof !");
   }
   public void growl(){
       System.out.println("grrrrr");

    }
}

class Animal{
    public void makenoise(){
        System.out.println("i'm just an animal");
    }
}


*/










/*public class Brocode {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }

    static int binomialCoefficient(int n, int k) {
        if (k > n - k) {
            k = n - k;
        }
        int result = 1;
        for (int i = 1; i <= k; i++) {
            result *= n - i + 1;
            result /= i;
        }
        return result;
    }
}
*/
/*
public class Brocode {

    public static void main(String[] args) {
        int rows = 5;
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}
*/














//psvm = public static void main(String[]args){
//
//        }
//sout = System.out.println();


/*

public class Brocode {
    public static void main(String[] args){
    Rabbit rabbit = new Rabbit();
    rabbit.flee();

    Hawk hawk = new Hawk();
    hawk.hunt();

    Fish fish = new Fish();
    fish.flee();
    fish.hunt();
    }

}
interface  Prey{
    void flee();
}

interface Prediator {
    void hunt();

}


class Hawk implements Prediator{
    public void hunt(){
        System.out.println("bad");
    }
}

class Rabbit implements Prey{
    public void flee(){
        System.out.println("good");

    }


}



class Fish implements Prey,Prediator{
    public void hunt(){
        System.out.println("bad");
    }
    public void flee(){
        System.out.println("good");
    }
}



*/















/*public class Brocode {
    public static void main(String[]args){
        //
        Fri fri1 = new Fri("sponzebob");
        Fri fri2 = new Fri("patric");
        System.out.println(Fri.numoffri);



    }
}

class Fri{
    String name;
    static int numoffri;
    Fri(String name){
        this.name=name;
        numoffri++;

    }
}

*/






















/*public class Brocode {
    public static void main(String[] args){
        Garage garage = new Garage();

        Car car = new Car("BMW");
        Car car1 = new Car("mastang");


        garage.park(car);
        garage.park(car1);

    }
}


class Garage{
    void park(Car car){
        System.out.println("the "+car.name+" is parking the garage");
    }
}


class Car{
    String name;
    Car(String name){
        this.name = name;
    }

}
*/


























/*public class Brocode {
    public static void main(String[] args){
       // Food[] reregirator = new Food[3];
        Food food1 = new Food("pizza");
        Food food2 = new Food("tomato");
        Food food3 = new Food("slice");

        Food[] reregirator = {food1,food2,food3};

       // reregirator[0] = food1;
        //reregirator[1] = food2;
        //reregirator[2] = food3;

        System.out.println(reregirator[0].name);
        System.out.println(reregirator[1].name);
        System.out.println(reregirator[2].name);
    }
}
class Food{
    String name;

    Food(String name){
        this.name = name;
    }
}


*/



























/*

public class Brocode{
    public static void main(String args[]){

        Pizza pizza = new Pizza("thic");
       // Pizza pizza = new Pizza("thic","red","potato","shewan");
        System.out.println("here is your pizza with");
        System.out.println(pizza.bread);
        System.out.println(pizza.saouse);
        System.out.println(pizza.topping);
        System.out.println(pizza.chips);


    }
}
class Pizza{
    String bread;
    String saouse;
    String chips;
    String topping;
    Pizza(String bread,String saouse,String chips,String topping){
        this.bread = bread;
        this.saouse= saouse;
        this.chips = chips;
        this.topping= topping;
    }

    Pizza(String bread,String saouse,String chips){
        this.bread = bread;
        this.saouse= saouse;
        this.chips = chips;
        this.topping= topping;
    }

    Pizza(String bread){
        this.bread = bread;
        this.saouse= saouse;
        this.chips = chips;
        this.topping= topping;
    }
}

*/



























/*
import java.util.Random;
public class Brocode {
    //dice game
    public static void main(String[] args) {
        // local: declared inside the method  and it is visible only to that method
        //global: declared outside the method but within a class  and visible to all parts of class

        Diceroller diceroller = new Diceroller();

    }
}
class Diceroller{
        Random random;
        int number;
        Diceroller(){
            random = new Random();
            roll();
        }
        void roll(){
            number = random.nextInt(6)+1;
            System.out.println(number);

        }
    }




*/























/*
public class Brocode {
        public static void main(String[] args){
         //constructor = is a spacial method that is called when an object is instantiated (created)
          Human human  = new Human("luffy",19,63);
          Human human1 = new Human("zoro",27,70);
          human.eat();
          human1.drink();
              //  System.out.println(human.name);

        }
}

class Human{
        String name;
        int age;
        double weight;

        Human(String name, int age , double weight){
             this.name = name;
              this.age = age;
              this.weight=weight;
        }
        void eat(){
                System.out.println(this.name+" is eating");
        }
        void drink(){
                System.out.println(this.name+" is drinking");
        }
}

*/





















/*
public class Brocode {
        public static void main(String [] args){
         //object = an instance of a class that may contain attributes and methods
         // example = objects surrounded by you(coffee-cup, bottle etc..,)
                cars myCar = new cars();
                cars myCar1 = new cars();
                System.out.println(myCar.model);
                System.out.println(myCar.make);
                System.out.println(myCar1.year);
                System.out.println(myCar1.color);
                System.out.println(myCar.price);
               myCar.drive();
                myCar1.brake();
        }
}
class cars{

        String make = "mastang";
        String model = "bas";
        int year = 2030;
        String color = "blue";
        double price = 300000.89;

        void drive(){//methods
                System.out.println("you drive a car");
        }
        void brake(){
                System.out.println("step on break");
        }
}


*/





































/*public class Brocode{
       public static void main(String[] args) {
               // overload method = method that shares the same name but have different parameters
               //                   method name + parameters = method signature
       double x = add(1.5,2.4,3.2,3.1,4.3);
       System.out.println(x);
       }
        static int add(int a, int b){
                System.out.println("1st methood");
                return a+b;
        }
        static int add(int a, int b, int c){
                System.out.println("2nd method ");
                return a+b+c;
        }
        static int add(int a, int b, int c ,int d){
               System.out.println("3rd method");
                return a+b+c+d;
        }
        static double add(double a, double b, double c ,double d,double f){
                System.out.println("4th method");
                return a+b+c+d+f;
        }
}


*/




















































        /*
                   primitive                           referance
                   8 types(boolean,byte,etc..)          unlimited(bcoz user defined)
                   stores data                          stores an address
                   can only hold one value              could hold more than one value
                   less memory                          more memory
                   fast                                 slower

                 */
        // System.out.println("Hello ");
       /* int a = 10;
        int b = 20;
        int c = a+b;

        System.out.println(c);
    */
        /*variables :-
            data type      size       primitive/refrence                value
             boolean        1 bit              primitive                true or false
             byte           1byte                   ||                  -128 to 127
             short          2bytes                  ||                -32,768 to 23,767
             int            4bytes                  ||                -2 billon to 2 billon
             long           8bytes                  ||                -9quantillion to 9 quantillion
             float          4bytes                  ||                 fractional number up to 6-7 digits ex.3.1415...f
             double         8bytes                  ||                fraction number up to 15 digits ex. 3.1415...
             char           2bytes                  ||                  single character/letter/ASCII value ex. 'f'
             string         varies               reference             a sequence of characters ex. "hello world"

             String x = "we";
                String y = "to";
                String temp;
                temp = x;
                x=y;
                y=temp;


                System.out.println("x:"+x);
                System.out.println("y:"+y);

         */

/*
import java.util.Scanner;
public class Brocode {
            public static void main(String args[]) {

                Scanner sc = new Scanner(System.in);
                System.out.println("enter your name: ");

                String name = sc.nextLine();

                System.out.println("enter your age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.println("eneter your favorite food");
                String food = sc.nextLine();

                System.out.println("hello "+name);
                System.out.println("you are "+age+" years old");
                System.out.println("you like "+food);


            }
}
*/

        /*
             //expression = operands and operators
      //operands = values, variables, numbers, quantity
      //operators = + - * / %

        int friends = 10;

        friends--;

        System.out.println(friends);
         */


/*
        import java.awt.desktop.ScreenSleepEvent;
        import java.util.ArrayList;
        import java.util.Scanner;

        /*

        import javax.swing.JOptionPane;

        public class Brocode {
            public static void main(String[] args){

                String name = JOptionPane.showInputDialog("enter your name");
                JOptionPane.showMessageDialog(null,"hello "+name);

                int age = Integer.parseInt(JOptionPane.showInputDialog("enetr your age"));
                JOptionPane.showMessageDialog(null,"you are "+age+" years old");


                double height = Double.parseDouble(JOptionPane.showInputDialog("enetr your height"));
                JOptionPane.showMessageDialog(null,"you are "+height+" tall");


            }

        }


         */
/*

    public class Brocode {
    public static void main(String[] args){
        double x;
        double y;
        double z;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter side x: ");
        x=sc.nextDouble();
        System.out.println("enter side y: ");
        y=sc.nextDouble();

       z= Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is : "+z);

        sc.close();
    }
}


 */

/*
       import java.util.Random;
        public class Brocode {
            public static void main(String[] args){
              //  Random rm = new Random();

              //  int x = rm.nextInt(6)+1;
                // double y = rm.nextDouble();
               // boolean z = rm.nextBoolean();
               // System.out.println(z);
            }
        }
 */
/*

public class Brocode {
    public static void main(String[] args){
        //if statement in java
        int age = 75;

        if(age==75){
            System.out.println("ok boomer");
        } else if (age>=18) {
            System.out.println("you are now adult");
        } else if (age>=13) {
            System.out.println("your a teen");
        } else {
            System.out.println("you are a child");
        }
    }
}
 */




/*

    public class Brocode {
    public static void main(String[] args){
        //switch statements

         String day = "dog";
         switch (day){
             case "sunday": System.out.println("it's sunday");
             break;
             case "monday": System.out.println("it's monday");
             break;
             case "friday": System.out.println("it's friday");
             break;
             default: System.out.println("that is not a day ");
         }
    }
}



 */

/*

    public class Brocode {
    public static void main(String[] args){
        //       logical operators
        //       && = (And) both conditions must be true
        //       || = (OR) either condition must be true
        //       ! = (NOT) reverses boolean value of condition

       /* int temp = 25;
        if(temp>30){
            System.out.println("it's hot out");
        } else if (temp>20 || temp<=30) {
            System.out.println("it is worm out");

        }
        else {
            System.out.println("it cold out");
        }

       */
/*
      Scanner sc = new Scanner(System.in);

              System.out.println("you are playing a game ! press q or Q to quit ");
              String rs = sc.next();
              if(!rs.equals("q") && !rs.equals("Q")){
              System.out.println("you are still playing right");
              }
              else {
              System.out.println("you want to quit the game right");
              }

              }
              }


 */


/*

    public class Brocode{
    public static void main(String[] args){
        //while loop
        Scanner sc = new Scanner(System.in);
        String name = "";

        do{
            System.out.println("enter your name: ");
            name = sc.nextLine();
        }while(name.isBlank());

        /*
        while(name.isBlank()){
            System.out.println("enter your name: ");
            name = sc.nextLine();
        }
         */

/*

        System.out.println("Hello "+name);
                }
                }

 */
/*
public class Brocode {
    public static void main(String[] args){
        // for loop
        for (int i = 10; i>=1; i-=2){
            System.out.println(i);

        }
    }
}*/

/*
public class Brocode {
 public static void main(String[] args){
     //nested loop

     Scanner sc = new Scanner(System.in);
     int rows;
     int col;
     String symbol = "";

     System.out.println("enter # of rows: ");
     rows = sc.nextInt();
     System.out.println("enter # of col: ");
     col = sc.nextInt();
     System.out.println("enter symbol to use ");
     symbol = sc.next();

     for(int i=1;i<=rows;i++){
         System.out.println();
         for (int j=1;j<=col;j++){
             System.out.println(symbol);

         }

     }
 }
}*/

/*
public class Brocode{
    public static void main(String[] args){
        //array = used to store multiple values in a single variable
        /*String[] cars = {"camaro","corvart","tesla","BMW"};

        cars[0] = "mustang";

        System.out.println((cars[0]));
        System.out.println((cars[1]));
        System.out.println((cars[2]));
        System.out.println((cars[3]));


         */

  /*      String[] cars = new String[3];
        cars[0]= "BMW";
        cars[1]= "tesla";
        cars[2]= "lambo";
       // System.out.println((cars[0]),(cars[1]),(cars[2]));
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

    }
}
*/

/*
public class Brocode{
    public static void main(String[] args){
        //2d arrays=an array of array

       // String[][] cars = new String[3][3];
        String [][] cars = {
                            {"bmw","lambo","mustang"},
                            {"camaro","f-50","ranger"},
                            {"bugatti", "tesla","ferrari"}
                            };


       /* cars[0][0] = "bmw";
        cars[0][1] = "lambo";
        cars[0][2] = "mustang";
        cars[1][0] = "ranger";
        cars[1][1] = "f-50";
        cars[1][2] = "camaro";
        cars[2][0] = "ferrari";
        cars[2][1] = "tesla";
        cars[2][2] = "bugatti";
        */
/*
        for(int i=0; i<cars.length; i++){
            System.out.println();
            for (int j= 0; j<cars[i].length; j++){
                System.out.println(cars[i][j]+" ");
            }

        }

    }
}
*/
/*
public class Brocode {
    public static void main(String[] args){
      // string = a reference data type that can be store one or more characters
      // reference data types have access to useful methods

      String name = "                      Ritikesh                         ";
      int len = name.length();
      System.out.println(len);
      boolean result = name.equalsIgnoreCase("ritikesh");
      System.out.println(result);
      char chr = name.charAt(0);
      System.out.println(chr);
      int index = name.indexOf("t");
      System.out.println(index);
      boolean emty = name.isEmpty();
      System.out.println(emty);
      String uppr = name.toUpperCase();
      System.out.println(uppr);
      String trm = name.trim();
      System.out.println(trm);
      String replace = name.replace("esh","no");
      System.out.println(replace);
    }
}

*/
/*
        public class Brocode {
            public static void main(String[] args){
                //wrapper class = provides a way to use premitive data type as referance data types
                //                  referance data types contains useful methods
                //                  can be used with collection (ex. ArrayList)

                // primitive            //wrapper
                //................................
                //boolean               Boolean
                //char                  Character
                //int                   Integer
                //double                Double

                // autoboxing = the autoboxing conversion that the java compiler makes between the primitive types and thier corresponding object wrapper classes
                //autoboxing = the reverse of autoboxing. automatic conversion of wrapper class to premitive

                Boolean a = true;
                Character b = '@';
                Integer c = 123;
                Double d = 3.14;
                String e = "Ritikesh";

                if(a==true){
                    System.out.println("this is true");
                }



                System.out.println();
            }
        }
 */
/*
        public class Brocode {
            public static void main(String[] args){
            //ArrayList = a resizable array.
            //              Element can be added and removed after compilation phase
            //              store referance data types

                ArrayList<String> food = new ArrayList<String>();
                food.add("pizza");
                food.add("sushi");
                food.add("hotdog");

                food.set(0,"hamburger");
                food.remove(2);
                food.clear();
                System.out.println("all clear bcoz you used  clear() method");

                for(int i=0 ; i<food.size();i++){
                    System.out.println(food.get(i));
                }
            }
        }

   */

/*
/*
//import java.util.*;
//public class Brocode{
  //  public static void main(String[] args){
      //2D array  list = dynamic list of lists
      //you can change the size of these lists during runtime

    //    ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

     //   ArrayList<String> bakeryList = new ArrayList<>();
       // bakeryList.add("donuts");
        //bakeryList.add("garlic bread");
        //bakeryList.add("pasta");

        //ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomato");
        produceList.add("potato");
        produceList.add("mango");

        ArrayList<String> DrinkList = new ArrayList<>();
        DrinkList.add("cola");
        DrinkList.add("sprite");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(DrinkList);

        System.out.println(groceryList.get(0).get(2));


    }
}
*/


/*
public class Brocode{
    public static void main(String[] args){
        //for each loop = traversing technique to iterate the element in an array/collection
        //                  less steps , more readable
        //                  less flexible

       // String[] animals = {"cat","dog","rat","bird"};
        ArrayList<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("rat");
        for(String i: animals){
            System.out.println(i);

        }
    }
}

 */
/*
public class Brocode{
    public static void main(String[] args) {
        //methods = a block of code executed whenever it is called upon
        String name = "Ritikesh";
        int age = 23;

        hello(name,age);

    }
        static void hello(String name,int age){

            System.out.println("hello "+name + " u are "+age+" years old");
        }
    }
*/