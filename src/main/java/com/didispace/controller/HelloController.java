package com.didispace.controller;

import com.didispace.domain.p.UserRepository;
import com.didispace.domain.s.MessageRepository;
import com.didispace.domain.s.SocialRatingCacheRepository1;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;


    @Autowired
    private com.didispace.domain.p.SocialRatingCacheRepository socialRatingCacheRepository_P;

    @Autowired
    private SocialRatingCacheRepository1 socialRatingCacheRepository_1_s;
    @RequestMapping("/hello")
    public String index() throws IOException {

        List<com.didispace.domain.p.SocialRatingCache> list_p=socialRatingCacheRepository_P.findAll();
        ObjectMapper mapper= new ObjectMapper();
        String list_p_json=mapper.writeValueAsString(list_p);
        System.out.println("从h2查出的数据"+list_p_json);


        CollectionType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class,com.didispace.domain.s.SocialRatingCache.class);
//the sieze of the list is dependon the str json length although the json content is not the POJO type maybe
        List<com.didispace.domain.s.SocialRatingCache> list = mapper.readValue(list_p_json, listType);
        socialRatingCacheRepository_1_s.save(list);





        return "Hello World";
    }

}