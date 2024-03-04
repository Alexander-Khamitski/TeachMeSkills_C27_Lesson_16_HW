package com.teachmeskills.lesson16.hw.factory.client;

import com.teachmeskills.lesson16.hw.consts.Constants;
import com.teachmeskills.lesson16.hw.factory.order.OrderFactory;
import com.teachmeskills.lesson16.hw.factory.date.DateFactory;
import com.teachmeskills.lesson16.hw.model.client.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory {

    public static Map<String, Client> generateClientMap() {
        Client client1 = new Client(
                Constants.CLIENT_1_PASSPORT_NUMBER,
                "Alexander",
                29,
                DateFactory.generateRandomDate(),
                OrderFactory.generateFirstOrder());
        Client client2 = new Client(
                Constants.CLIENT_2_PASSPORT_NUMBER,
                "Roman",
                30,
                DateFactory.generateRandomDate(),
                OrderFactory.generateSecondOrder());
        Client client3 = new Client(
                Constants.CLIENT_3_PASSPORT_NUMBER,
                "Inna",
                26,
                DateFactory.generateRandomDate(),
                OrderFactory.generateSecondOrder()
        );
        Map<String, Client> map = new HashMap<>();
        map.put(client1.getPassportNumber(), client1);
        map.put(client2.getPassportNumber(), client2);
        map.put(client3.getPassportNumber(), client3);
        return map;
    }

}
