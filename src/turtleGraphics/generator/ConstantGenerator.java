package turtleGraphics.generator;

public class ConstantGenerator extends Generator {
    private double constant;
    
    public ConstantGenerator(double constant) {
        this.constant = constant;
    }
    
    public double next() {
        return constant;
    }
    
    public void skip(int numSteps) {
        // do nothing!
    }
}
