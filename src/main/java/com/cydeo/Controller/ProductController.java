package com.cydeo.Controller;

import com.cydeo.model.Product;
import com.cydeo.service.CartService;
import com.cydeo.service.ProductService;
import com.cydeo.service.impl.CartServiceImpl;
import com.cydeo.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @RequestMapping("search-product/{name}")
    public String productIfno(@PathVariable String name, Model model){
        ProductService productService = new ProductServiceImpl();
        List<Product>productList = productService.searchProduct(name);
        model.addAttribute("productList",productList);

        return "product/product-list";
    }
}
