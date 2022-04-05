package ro.unibuc.factory;

public class DrawShapes {

    //use drawShape method to instantiate an object of shapeType
    public Shape drawShape(String shapeType){
        if(shapeType == null){
            return new DefaultShape();
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return new DefaultShape();
    }
}

