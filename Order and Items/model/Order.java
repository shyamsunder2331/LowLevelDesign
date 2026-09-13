import java.util.*;
class Order{
    private String OrderId;
    private final List<LineItems> lineItems;
    public Order(String OrderId){
        this.OrderId=OrderId;
        lineItems=new ArrayList<>();
    }
    public LineItems addItem(String productName,double unitPrice,double quantity){
        lineItems.add(new LineItems(productName,unitPrice,quantity));
        return lineItems.get(lineItems.size()-1);
    }
    public void deleteItem(LineItems item){
        lineItems.removeIf(items->items.getProductName().equals(item.getProductName()));
    }
    public double getTotal(){
        double total=0;
        for(LineItems i:lineItems){
            i.describe();
            total+=i.getSubTotal();
        }
        return total;
    }
}