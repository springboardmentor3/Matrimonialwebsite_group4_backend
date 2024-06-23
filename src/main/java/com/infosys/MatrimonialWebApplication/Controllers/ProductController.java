//package com.infosys.MatrimonialWebApplication.Controllers;
//
//
//import com.infosys.MatrimonialWebApplication.Service.ProductService;
//import com.infosys.MatrimonialWebApplication.entitites.Product;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//
//@CrossOrigin("*")
//public class ProductController {
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping("/add")
//    public String addProductUI(Model model) {
//        model.addAttribute("product", new Product());
//        return "add-product";
//    }
//
//    @PostMapping("/add")
//    public String addProduct(@ModelAttribute Product product, @RequestParam("imageFile") MultipartFile imageFile) throws IOException, IOException {
//        productService.addProduct(product, imageFile);
//        return "redirect:/get-products";
//    }
//
//    @GetMapping("/get-products")
//    public String listProducts(Model model) {
//        List<Product> products = productService.getProducts();
//        model.addAttribute("products", products);
//        return "get-products";
//    }
//
//    @GetMapping(value = "/{productId}/image")
//    public ResponseEntity<byte[]> getProductImage(@PathVariable Long productId) {
//        Optional<Product> productOptional = productService.getProduct(productId);
//        if (productOptional.isPresent()) {
//            Product product = productOptional.get();
//            byte[] imageBytes = java.util.Base64.getDecoder().decode(product.getImage());
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.IMAGE_JPEG);
//            return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(new byte[0], HttpStatus.NOT_FOUND);
//        }
//    }
//}

package com.infosys.MatrimonialWebApplication.Controllers;

import com.infosys.MatrimonialWebApplication.Service.ProductService;
import com.infosys.MatrimonialWebApplication.entitites.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products") // Base path for product-related endpoints
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Endpoint to add a new product with image
    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@ModelAttribute Product product, @RequestParam("imageFile") MultipartFile imageFile) {
        try {
            productService.addProduct(product, imageFile);
            return ResponseEntity.status(HttpStatus.CREATED).body("Product added successfully");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add product");
        }
    }

    // Endpoint to retrieve all products
    @GetMapping("/get-all")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getProducts();
        return ResponseEntity.ok(products);
    }

    // Endpoint to retrieve product image by productId
    @GetMapping("/{productId}/image")
    public ResponseEntity<byte[]> getProductImage(@PathVariable Long productId) {
        Optional<Product> productOptional = productService.getProduct(productId);
        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            byte[] imageBytes = java.util.Base64.getDecoder().decode(product.getImage()); // Assuming image is stored as Base64 string in Product entity
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);
            return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

