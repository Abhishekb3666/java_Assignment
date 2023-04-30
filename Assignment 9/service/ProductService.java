package service;

import model.Product;
import repos.DBUtil;
import repos.ProductRepo;

public class ProductService {

    private static boolean checkQuantity(int id, int quantity){
        ProductRepo productRepo = new ProductRepo();
        Product product = productRepo.getProductById(id);
        return product.getQuantity() <= quantity;
    }


    public static double getBillAmount(int id, int quantity) {
        // getting the requested product
        ProductRepo productRepo = new ProductRepo();
        Product product = productRepo.getProductById(id);

        // return -1 if quantity in stock is not enough
//        if(!checkQuantity(id, quantity))
//            return -1;

        return product.getPrice() * quantity;
    }

    public static boolean purchase(int id, int quantity) {
        ProductRepo productRepo = new ProductRepo();
        Product product = productRepo.getProductById(id);
//        if(!checkQuantity(id, quantity))
//            return false;

        return productRepo.updateProductQuantity(id, (product.getQuantity() - quantity));
    }



}