public class Execute {
    public static void main(String[] args) {
        // Create 3 polygon objects
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        // Displays outputs
        System.out.println("\n-----------------------------------------------------");
        System.out.println("Polygon Objects   |  Perimeter    |    Area     |");
        System.out.println("--------------------------------------------------------");
        System.out.printf("|    Object 1     |%8.2f       |%6.2f       |\n",
                polygon1.getPerimeter(), polygon1.getArea());
        System.out.printf("|    Object 2     |%8.2f       |%6.2f       |\n",
                polygon2.getPerimeter(), polygon2.getArea());
        System.out.printf("|    Object 3     |%8.2f       |%6.2f       |\n",
                polygon3.getPerimeter(), polygon3.getArea());
    }
}
