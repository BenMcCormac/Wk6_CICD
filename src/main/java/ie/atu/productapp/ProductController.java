package ie.atu.productapp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController
{
    private ProductService myService;


    public ProductController(ProductService myService) {
        this.myService = myService;
    }

    private List<Product> list = new ArrayList<>();
    //Creating a class interested in requests and responses,  Separation of Concern

    @PostMapping("/createProduct")
    public List<Product> newProduct(@RequestBody Product product)
    {
        //send it to business logic
        list = myService.addProduct(product);
        return list;
    }
}
