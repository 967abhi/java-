class calculator{
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b){
        return a+b;

    }
}




public class overloading{
    public static void main(String args[]){
         calculator obj=new calculator();
         int r1=obj.add(3,4);
         System.out.println(r1);
    }
}