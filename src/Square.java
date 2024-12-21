public class Square implements AreaComputable {
   private int side;

   public Square(int side) {
       this.side = side;
   }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
