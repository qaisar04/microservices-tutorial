package kz.baltabayev.productservice.controller;

import kz.baltabayev.productservice.dto.ProductRequest;
import kz.baltabayev.productservice.dto.ProductResponse;
import kz.baltabayev.productservice.service.ProsuctService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProsuctService prosuctService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        prosuctService.createProduct(productRequest);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return prosuctService.getAllProducts();
    }

}
