package org.sid.demospringcloudstreamskafka.services;
import org.sid.demospringcloudstreamskafka.entities.PageEvent;
import org.springframework.stereotype.Service;
import java.util.function.Consumer;
@Service
public class PageEventService {
    @Bean
    public Consumer<PageEvent> PageEventConsumer(){
        return(input)->{
            System.out.println("*****************");
            System.out.println(input.toString());
            System.out.println("*****************");
        };
    }
}
