package com.razorpay.payload;


import lombok.Data;

@Data
public class OrderRequest {

    long amount;
    String currency;
}
