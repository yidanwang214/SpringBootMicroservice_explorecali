package com.example.tourservice;

import com.example.tourservice.utilities.TourRepository;
import org.springframework.context.annotation.Bean;

public class SpringBeans {
    @Bean
    public TourRepository tourRepository(){return new TourRepository();}
    @Bean
    public TourManagementService tourManagementService(){return new TourManagementService(tourRepository());}
    @Bean
    public TravelAgentService travelAgentService(){return new TravelAgentService(tourRepository());}
}
