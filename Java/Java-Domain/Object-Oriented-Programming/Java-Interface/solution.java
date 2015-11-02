class MyCalculator implements AdvancedArithmetic{
    String getName(){
        return "AdvancedArithmetic";
    }
    
    @Override
    public int divisorSum(int n){
        int value = 0;
        for(int i=1; i <= n ; i++){
            if(n%i == 0){
                value += i;
            }
        }
       // System.out.println(value);
        //System.out.println(n);
        return value;
    }
}