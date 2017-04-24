package com.idodevjobs.sample.service;
 
import com.idodevjobs.sample.model.ExampleModel;
import org.springframework.stereotype.*;
 
@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
 
    
    public ExampleModel get(String modelId) {
        return new ExampleModel("example", 1001);
    }
}