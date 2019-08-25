package com.mkyon.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "domain")
public class Domain {

    @Id
    private long id;//make as primary key

    @Indexed(unique = true)
    private String domain;

    private boolean displayAds;

    //getters and setters 
}
