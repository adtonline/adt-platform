package io.github.adt;

import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class Application {
  @PostConstruct
  void started() {
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
  }

  public static void main(String[] args) {
    new SpringApplication(Application.class).run(args);
  }
}