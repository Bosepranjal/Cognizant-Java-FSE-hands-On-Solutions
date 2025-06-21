package FactoryMethodPatternExample;

//Concrete document class for PdfDocument
public class PdfDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document.");
    }
}

