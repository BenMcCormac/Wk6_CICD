package ie.atu.productapp;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

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
    public List<Product> newProduct(@Valid @RequestBody Product product)
    {
        //send it to business logic
        list = myService.addProduct(product);
        return list;
    }

    @PutMapping("/{id}")
    public List<Product> oldProduct(@PathVariable int id, @RequestBody Product product)
    {

        list = myService.updateP(id, product);
        return list;
    }
}