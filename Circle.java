class Circle extends Shape {
    //Parameterized constructor
    public Circle(double radius){
        super(radius,0,0,4);
    }
    public double calculateArea(){
        return (dim_one*dim_one)  * 3.14;
    }
    public double calculatePerimeter(){
        return 2 * 3.14 *(dim_one);
    }
}
