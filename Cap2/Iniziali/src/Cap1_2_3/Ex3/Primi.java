package Cap1_2_3.Ex3;

import textio.TextIO;

public class Primi {
    public static void main(String[] args) {
        TextIO.put("1 ");//stampo 1
       
        int n=2;//inizializzo varibile
        for(int i=1;i<20;){   
            int x=2;//Inizializzo la mia variabile che itera
            while(true){
                if(n%x==0 && n==x){ //Controllo se non ha resto ed sia divisibile per se stesso
                    TextIO.put(n+" ");
                    i++;
                    break;
                }
                else if(n%x==0 && n>x){//Controllo se non ha resto ed sia divisibile per un numero minore
                    break;
                }
                else{//Aumento di uno la mia variabile intera che divide il numero
                    x++;
                }
            }
            n++;//Aumento di uno il mio nuovo numero a valutare
        }
    }
}
