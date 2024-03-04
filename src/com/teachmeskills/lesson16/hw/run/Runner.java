package com.teachmeskills.lesson16.hw.run;

import com.teachmeskills.lesson16.hw.factory.client.ClientFactory;
import com.teachmeskills.lesson16.hw.model.client.Client;
import com.teachmeskills.lesson16.hw.service.MapService;

import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        Map<String, Client> clientMap = ClientFactory.generateClientMap();
        MapService.getClientInfoByMapEntry(clientMap);
        MapService.getClientInfoByIterator(clientMap);
        MapService.getAllMapKeys(clientMap);
        MapService.getAllMapValues(clientMap);
    }

}
