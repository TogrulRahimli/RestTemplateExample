package com.template;

import com.template.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestTemplateExampleApplicationTests {

    private static final String ROOT_URL = "http://localhost:8080";

    @Test
    public void getUsersService() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(ROOT_URL + "/users");

        ResponseEntity<User[]> response = restTemplate.getForEntity(uri, User[].class);

        Assert.assertEquals(200, response.getStatusCodeValue());
        Assert.assertNotNull(response.getBody());
    }

    @Test
    public void getSingleUserService() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(ROOT_URL + "/users/" + 1);

        ResponseEntity<User> response = restTemplate.getForEntity(uri, User.class);

        Assert.assertEquals(200, response.getStatusCodeValue());
        Assert.assertNotNull(response.getBody());
    }

}
