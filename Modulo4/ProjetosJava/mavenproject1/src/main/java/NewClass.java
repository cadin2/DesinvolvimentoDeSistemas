public class NewClass {
    public static void main(String[] args){
        double a,b,c,x1,x2,delta;
        
        a=4;
        b=6;
        c=3;
        
        delta = Math.pow(b,2)- 4*a*c;
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);
        
        if (delta < 0){
            System.out.format("a raiz de delta não existe");
        }
        else{
            System.out.format("Delta: %.2d \n x1: %.2d \n x2: %.2d");
        }
    }
}
