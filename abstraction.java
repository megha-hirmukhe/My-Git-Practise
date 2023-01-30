//abstract class
abstract class abstraction {

    abstract void activity();
}

class teacher extends abstraction{
    void activity(){
        System.out.println("teacher can teach can eat can walk");
    }

}

class farmer extends abstraction{
    void activity(){
        System.out.println("farmer do farming.");
    }
}
class myMain{
    public static void main(String[] args){
        //cannot create object of abstract class. create a object of subclass

        teacher t= new teacher();
        t.activity();

        farmer f= new farmer();
        f.activity();
    }

}
