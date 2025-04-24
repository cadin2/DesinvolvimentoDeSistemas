public class bhaskara{
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c = 9;
        float delta = (float) Math.pow(b,2) - 4 * a * c;
        
        if (delta < 0){
            System.out.println("o delta não existe");
        }
        else{
            float x1 = (float) (-b + Math.sqrt((float)delta))/(2 * a);
            float x2= (float) (-b - Math.sqrt((float)delta)) /(2 * a);
            
        }
    }
}       