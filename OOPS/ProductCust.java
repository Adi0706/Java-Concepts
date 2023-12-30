
class Product{
    private String itemno;
    private String name ;
    private double price ;
    private int qty ; 


    public Product(String itemno,String itemname,double itemprice , int quantity ){
        this.itemno = itemno;
        this.name = itemno ; 
        this.price =  itemprice ; 
        this.qty = quantity ;

    }

    public void getDetails(){
        System.out.println("THE PRODUCT DETAILS ARE") ; 
        System.out.println("Item Number " + this.itemno);
    }
}


class ProductCust {

}