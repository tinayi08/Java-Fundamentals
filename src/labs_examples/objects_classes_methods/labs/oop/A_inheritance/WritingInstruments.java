package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class WritingInstruments {
    private String brand;
    private String bodyColor;
    private boolean cap;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public boolean isCap() {
        return cap;
    }

    public void setCap(boolean cap) {
        this.cap = cap;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public WritingInstruments (String brand, String bodyColor, boolean cap, int price) {
        this.brand = brand;
        this.bodyColor = bodyColor;
        this.cap = cap;
        this.price = price;

    }
    public void bodyColor(String bodyColor){
        System.out.println("This is a " + bodyColor + " pen but the ink color can be changed to any color.");
    }

    public void price(String brand, int price) {
        System.out.println("This " + brand + " pen costs " + price + " dollars.");
    }
}

class ColorPencilSets extends WritingInstruments {
    int numPencils;

    public int getNumPencils() {
        return numPencils;
    }

    public void setNumPencils(int numPencils) {
        this.numPencils = numPencils;
    }

    public ColorPencilSets(String brand, String bodyColor, boolean cap, int price, int numPencils) {
        super(brand, bodyColor, cap, price);
        this.numPencils = numPencils;
    }
    @Override
    public void bodyColor(String bodyColor){
        System.out.println("This is a " + bodyColor + " colored pencil set which means all the color pencils in this set write in different shades of " + bodyColor);
    }
    @Override
    public void price(String brand, int price) {
        System.out.println("The price of the " + brand + " color pencil set is " + price + " dollars.");
    }
}

class MechanicalPencil extends WritingInstruments {
    double leadSize;
    boolean rubberGrip;

    public double getLeadSize() {
        return leadSize;
    }

    public void setLeadSize(double leadSize) {
        this.leadSize = leadSize;
    }

    public boolean isRubberGrip() {
        return rubberGrip;
    }

    public void setRubberGrip(boolean rubberGrip) {
        this.rubberGrip = rubberGrip;
    }

    public MechanicalPencil(String brand, String bodyColor, boolean cap, int price, double leadSize, boolean rubberGrip) {
        super(brand, bodyColor, cap, price);
        this.leadSize = leadSize;
        this.rubberGrip = rubberGrip;
    }

}

class FancyPens extends WritingInstruments {
    String brandSeries;
    String penType;
    String bodyMaterial;


    public String getBrandSeries() {
        return brandSeries;
    }

    public void setBrandSeries(String brandSeries) {
        this.brandSeries = brandSeries;
    }

    public String getPenType() {
        return penType;
    }

    public void setPenType(String penType) {
        this.penType = penType;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public FancyPens(String brand, String bodyColor, boolean cap, int price, String brandSeries, String penType, String bodyMaterial) {
        super(brand, bodyColor, cap, price);
        this.brandSeries = brandSeries;
        this.penType = penType;
        this.bodyMaterial = bodyMaterial;

    }

    public void series (String brand, String brandSeries) {
        System.out.println("this is a pen from " + brand + " and it is from their " + brandSeries + " line");
    }

}

class FountainPen extends FancyPens {
    String nibSize;
    boolean goldNib;
    String inkColor;

    public String getNibSize() {
        return nibSize;
    }

    public void setNibSize(String nibSize) {
        this.nibSize = nibSize;
    }

    public boolean isGoldNib() {
        return goldNib;
    }

    public void setGoldNib(boolean goldNib) {
        this.goldNib = goldNib;
    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public FountainPen (String brand, String bodyColor, boolean cap, int price, String brandSeries, String penType,
                        String bodyMaterial, String nibSize, boolean goldNib, String inkColor) {

        super(brand, bodyColor, cap, price, brandSeries, penType, bodyMaterial);
        this.nibSize = nibSize;
        this.goldNib = goldNib;
        this.inkColor = inkColor;
    }



    @Override
    public void series (String brand, String brandSeries) {
        System.out.println("This is a fountain pen from " + brand + " and it is from their " + brandSeries + " line");
    }

}

class ControllerClass {
    public static void main (String [] args) {
        FountainPen fountainPen = new FountainPen("MontBlanc", "Black", true, 500, "M", "Fountain Pen", "Resin",
                "Medium", true, "Blue");
        ColorPencilSets redColorPencilSet = new ColorPencilSets("Staedtler", "red", false, 10, 7);

        fountainPen.series(fountainPen.getBrand(), fountainPen.getBrandSeries());
        fountainPen.price(fountainPen.getBrand(), fountainPen.getPrice());
        fountainPen.bodyColor(fountainPen.getBodyColor());

        redColorPencilSet.price(redColorPencilSet.getBrand(), redColorPencilSet.getPrice());
        redColorPencilSet.bodyColor(redColorPencilSet.getBodyColor());

    }
}