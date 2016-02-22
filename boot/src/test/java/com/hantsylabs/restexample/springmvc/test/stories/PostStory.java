package com.hantsylabs.restexample.springmvc.test.stories;

import com.hantsylabs.restexample.springmvc.repository.PostRepository;
import com.hantsylabs.restexample.springmvc.test.AbstractSpringJBehaveStory;
import com.hantsylabs.restexample.springmvc.test.AcceptanceTest;
import com.hantsylabs.restexample.springmvc.test.steps.PostSteps;
import javax.inject.Inject;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.TestRestTemplate.HttpClientOption;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@AcceptanceTest
public class PostStory extends AbstractSpringJBehaveStory {

    @Inject
    PostRepository postRepository;

    TestRestTemplate restTemplate;

    String baseUrl;

    @Value("${local.server.port}")
    int port;

    @Before
    public void setup() {
        this.baseUrl = "http://localhost:" + port;
        this.restTemplate = new TestRestTemplate("admin", "test123", new HttpClientOption[]{});
    }

    @Override
    public Object[] getSteps() {
        return new Object[]{new PostSteps(postRepository, restTemplate, baseUrl)};
    }

}
