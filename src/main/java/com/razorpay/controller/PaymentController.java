package com.razorpay.controller;

import com.razorpay.*;
import com.razorpay.payload.OrderRequest;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {
//http:localhost:8080/api/create-order
@RequestMapping("/create-order")
    public String createOrder(@RequestBody OrderRequest order) throws Exception {
        RazorpayClient razorpay = new RazorpayClient("rzp_test_IuWlGFw4ublVvw", "c5VRZtd4MS0tGspont9bLcim");

        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount", order.getAmount()); // amount in the smallest currency unit
        orderRequest.put("currency", order.getCurrency());
        orderRequest.put("receipt", "Shivam");

        Order orderResponse = razorpay.orders.create(orderRequest);

 return orderResponse.get("id");

    }
}
