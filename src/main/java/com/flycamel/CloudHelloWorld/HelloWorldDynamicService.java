package com.flycamel.CloudHelloWorld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RefreshScope
public class HelloWorldDynamicService {
    @Value("${helloworld.value.first}")
    private String first;

    @Value("${helloworld.value.second}")
    private String second;

    public Map<String, String> getTestKeywords() {
        Map<String, String> keywords = new HashMap<>();
        keywords.put("first", first);
        keywords.put("second", second);

        return keywords;
    }
}
