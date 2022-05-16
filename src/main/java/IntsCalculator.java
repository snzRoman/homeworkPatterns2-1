public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {

        Double sum = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result;
        return sum.intValue();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Double mult = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result;
        return mult.intValue();
    }

    @Override
    public int pow(int a, int b) {
        Double pow = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result;
        return pow.intValue();
    }
}
