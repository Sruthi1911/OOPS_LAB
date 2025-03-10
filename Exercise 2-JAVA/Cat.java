class Cat{
    String name;
    String color;
    String behavior;
    cat(){
        System.out.println("A cat is cute.");
    }
}
cat(String name){
    this.name=name;
    System.out.println("A cat named"+name+"is soo cute.");
}
cat(String name,String color){
    this.name=name;
    this.color=color;
    System.out.println("A cat named"+name+"it's color is "+color);

}
cat(String name,String color,String behavior){
    this.name=name;
    this.color=color;
    this.behavior=behavior;
    System.out.println("A cat name is"+name+"colored"+color+"and it's behavior"+behavior);

}
public class CatMain{
    public static void main (String[] args){
        Cat cat1=new Cat();
        Cat cat2=new Cat("Vijju");
        Cat cat3=new Cat("vijju","white");
        Cat cat4=new Cat("CUTE");
    }
}