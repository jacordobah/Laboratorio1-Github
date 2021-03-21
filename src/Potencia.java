public class Potencia {

    int x;
    int n;
    
    public Potencia(int x, int int n){

        this.x = x;
        this.n = n;

    }
    
    public int potencia(){

        int power = 1;

        for(int i = 0; i < this.n; i++){
            power = power*this.x;
        }

        return power;

    }

}