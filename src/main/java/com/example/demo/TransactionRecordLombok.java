package com.example.demo;

import lombok.Data;

@Data
public class TransactionRecordLombok {

    private final String from;
    private final String to;
    private final int amount;

}
