package amazonImplementations;

public class Search {

    //method to return and search product in thr product list and matching it with
    //search steps product constructor

    public String displayProduct(Product tempProduct)
    {
        if (tempProduct.getProductList().contains(tempProduct.getProductName()))
        {
            return tempProduct.getProductName();
        }
        return null;
    }

}
