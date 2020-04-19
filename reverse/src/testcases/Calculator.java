package testcases;

class Calculator {
    public  int add (int i, int j){
        return i + j;
    }
}

class Calculatoradv extends  Calculator {
    public  int add (int i, int j){
        return i + j;
    }

    public  int Sub (int i, int j){
        return i - j;
    }
}


class Inheritancedemo{

    public static void main (String args[]){
        Calculatoradv c2 = new Calculatoradv();
        int result  = c2.add(5,4);
        int result2 = c2.Sub(5,4);

        System.out.println(result);
        System.out.println(result2);
    }

}
