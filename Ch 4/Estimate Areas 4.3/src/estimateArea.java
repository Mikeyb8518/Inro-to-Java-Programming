public class estimateArea {
    public static void main(String[] args) {

        final double radius = 6371.01;

        double AtlToCharlotte = radius * Math.acos(Math.sin(33.7489954)) * Math.sin(35.2270869) + Math.cos(33.7489954)
                * Math.cos(35.2270869) * Math.cos(-84.3879824 - -80.8431267);
        double CharToSavannah = radius * Math.acos(Math.sin(35.2270869)) * Math.sin(32.0835407) + Math.cos(35.2270869)
                * Math.cos(32.0835407) * Math.cos(-80.8431267 - -81.0098342);
        double SavannahToAtl = radius * Math.acos(Math.sin(32.0835407)) * Math.sin(33.7489954) + Math.cos(32.0835407)
                * Math.cos(33.7489954) * Math.cos(-81.0998342 - -84.3879824);

        double Triangle1 = AtlToCharlotte + CharToSavannah + SavannahToAtl;

        double area1 = Math.sqrt(Triangle1 * (Triangle1 - AtlToCharlotte) * (Triangle1 - CharToSavannah)
            * (Triangle1 - SavannahToAtl));

        double SavannahToOrlando = radius * Math.acos(Math.sin(32.0835407)) * Math.sin(28.5383355) + Math.cos(32.0835407)
                * Math.cos(28.5383355) * Math.cos(-81.0998342 - -81.3792365);
        double OrlandoToAtl = radius * Math.acos(Math.sin(28.5383355)) * Math.sin(33.7489954) + Math.cos(28.5383355)
                * Math.cos(33.7489954) * Math.cos(-81.3792365 - -84.3879824);

        double Triangle2 = SavannahToOrlando + OrlandoToAtl + SavannahToAtl;

        double area2 = Math.sqrt(Triangle2 * (Triangle2 - SavannahToOrlando) * (Triangle2 - OrlandoToAtl)
            * (Triangle2 - SavannahToAtl));

        double total = area1 + area2;

        System.out.println("The area of the four cities is " + total + " km");
    }
}
