class Cube extends Shape {
    // parameterized Constructor
    public Cube(double length){
        super(length,0,0,0);
    }
    public double calculateArea(){
        return  (dim_one * dim_one*dim_one);
    }
    public double calculatePerimeter(){
        return 12*(dim_one);
    }
}
