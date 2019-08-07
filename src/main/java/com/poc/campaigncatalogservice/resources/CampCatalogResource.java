package com.poc.campaigncatalogservice.resources;

import com.poc.campaigncatalogservice.models.Campaign;
import com.poc.campaigncatalogservice.models.CatalogItem;
import com.poc.campaigncatalogservice.models.UserGoal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class CampCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String usedId) {


        UserGoal theGoals = restTemplate.getForObject("http://team-objective-service/teamObj/user/" + usedId, UserGoal.class);

        //get all camp id with goal

        //Campaign camp = restTemplate.getForObject("http://localhost:8082/camp", Campaign.class);


        return theGoals.getUserGoal().stream().map(goal -> {
            //for each id call camp info service and get details
            Campaign camp = restTemplate.getForObject("http://campaign-info-service/camp/" + goal.getCampId(), Campaign.class);

            //put them together
            return new CatalogItem(camp.getName(), "Test DESC", goal.getCampGoal());

        })
                .collect(Collectors.toList());


    }
}

// Reactive way of fetching data, using WebClient

//            Campaign camp = webClientBuilder.build()
//                    .get()
//                    .uri("http://localhost:8082/camp/" + goal.getCampId())
//                    .retrieve()
//                    .bodyToMono(Campaign.class)
//                    .block();