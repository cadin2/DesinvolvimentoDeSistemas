package com.mycompany.meses;
public class Meses {

    public static void main(String[] args) {
        String mes [] = {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
        int tot [] ={31,29,31,30,31,30,31,31,30,31,30,31};
        
        for(int i = 0; i < mes.length; i++){
            System.out.printf("%s tem %d dias\n",mes[i],tot[i]);
        };
    }
}
