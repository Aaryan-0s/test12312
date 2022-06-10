    class bike {
        static  int a;
        public   void name(){
            System.out.println("This is the name of the bike");
    }

}
class bmw extends bike{

    @Override
    public void name() {
        System.out.println("this is a bmw ");
    }
}
 public   abstract class gg  {

     public static void main(String[] args) {
         bike bs=new bike();
         bs.name();

     }






 }







