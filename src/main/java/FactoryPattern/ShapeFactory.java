package FactoryPattern;

public
class ShapeFactory {
    public
    Circle getShape(String shapetype){
        if(shapetype == null){
          return null;
        }
        else if(shapetype.equals("Circle")){
            return new Circle();
        }
        else if(shapetype.equals("Rectangle")){
            return new Circle();
        }
        return null;
    }
}
