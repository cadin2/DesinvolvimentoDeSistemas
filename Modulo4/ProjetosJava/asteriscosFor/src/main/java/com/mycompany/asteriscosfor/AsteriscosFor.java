package com.mycompany.asteriscosfor;
public class AsteriscosFor {

    public static void main(String[] args) {
        int altura = 5;
        for(int i = 1; i<=altura;i++){;
            for(int c = 1; c<=i;c++){
                System.out.print("*");
            }
            System.out.println();
        } 
        
        for (int j = 1; j <= altura; j++){
            for(int k = 1; k <= altura - j;k++){
                System.out.print(" ");
            }
            for(int l = 1; l <= j; l++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int j = 1; j <= altura; j++){
            for(int k = 1; k <= altura - j;k++){
                System.out.print(" ");
            }
            for(int l = 1; l <= j; l++){
                System.out.print("#");
            }
            
            System.out.print(" ");
        
            for(int c = 1; c<=j;c++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
} 
