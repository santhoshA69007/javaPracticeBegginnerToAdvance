public class SimpleCalculator {

    private int firstNumber,secondNumber;

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void getAdditionResult(){
        System.out.println(firstNumber+" + "+secondNumber+" = "+(firstNumber+secondNumber));
    }

    public void getSubstrationResult(){
        System.out.println(firstNumber+" - "+secondNumber+" = "+(firstNumber-secondNumber));
    }
    public void getDivisionResult(){
        int res=(firstNumber/secondNumber);
        System.out.println(firstNumber+" / "+secondNumber+" = "+(res>0?res:0));
    }

    public void getMultiplicationResult(){
        System.out.println(firstNumber+" * "+secondNumber+" = "+(firstNumber*secondNumber));
    }
}
