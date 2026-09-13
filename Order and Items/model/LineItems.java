class LineItems{
    private String productName;
    private double unitPrice;
    private double quantity;

    public LineItems(String productName,double unitPrice,double quantity){
        this.productName=productName;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }
    public double getSubTotal(){
        return unitPrice*quantity;
    }
    public String getProductName(){
        return productName;
    }
    public void describe(){
        System.out.println("productName: "+this.productName+","+" Unit Price "+unitPrice+", "+"Quantity "+this.quantity);
    }

}