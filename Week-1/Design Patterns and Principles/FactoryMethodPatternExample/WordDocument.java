package FactoryMethodPatternExample;

//Concrete document class for wordDocument
public class WordDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening Word document.");
    }
}

