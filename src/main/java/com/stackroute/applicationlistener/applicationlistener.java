package com.stackroute.applicationlistener;

import com.stackroute.domain.Music;
import com.stackroute.repository.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class applicationlistener implements ApplicationListener<ContextRefreshedEvent> {
    private UserMongoRepository musicRepository;
    @Autowired
    public void setrepository(UserMongoRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent applicationEvent) {
        musicRepository.save(new Music(1, "Edge of Desire", "From Battle Studies"));
        musicRepository.save(new Music(2, "Hello", "Hellofromtheothersideeee"));
    }
}