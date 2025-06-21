package FactoryMethodPatternExample;

//Concrete document class for ExcelDocument
public class ExcelDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening Excel document.");
    }
}

