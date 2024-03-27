package com.cydeo.Controller;

import com.cydeo.model.Cart;
import com.cydeo.model.CartItem;
import com.cydeo.model.Product;
import com.cydeo.service.CartService;
import com.cydeo.service.impl.CartServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class CartController {
@RequestMapping("cart-list")
    public String cartInfo(Model model){
    CartService cartService = new CartServiceImpl();
    List<Cart>cartList =cartService.retrieveCartList();
    model.addAttribute("cartList",cartList);

        return "cart/cart-list";
    }
    @RequestMapping("cart-list/{cartId}")
    public String cartDetails(@PathVariable UUID cartId, Model model){
        CartService cartService = new CartServiceImpl();
        List<CartItem>cartItemList = cartService.retrieveCartDetail(cartId);
        model.addAttribute("cartItemList",cartItemList);

    return "cart/cart-detail";
    }
}
