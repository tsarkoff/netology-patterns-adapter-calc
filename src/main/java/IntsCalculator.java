public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    private int callTarget(int a, int b, Calculator.Operation op) {
        return (int) target.newFormula().addOperand(a).addOperand(b).calculate(op).result();
    }

    @Override
    public int sum(int a, int b) {
        return callTarget(a, b, Calculator.Operation.SUM);
    }

    @Override
    public int sub(int a, int b) {
        return callTarget(a, b, Calculator.Operation.SUB);
    }

    @Override
    public int mult(int a, int b) {
        return callTarget(a, b, Calculator.Operation.MULT);
    }

    @Override
    public int div(int a, int b) {
        return callTarget(a, b, Calculator.Operation.DIV);
    }

    @Override
    public int pow(int a, int b) {
        return callTarget(a, b, Calculator.Operation.POW);
    }
}