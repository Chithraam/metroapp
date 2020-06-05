package com.swissre.hackathon.app.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.swissre.hackathon.app.model.Location;
import org.springframework.stereotype.Service;

import com.swissre.hackathon.app.model.Store;

@Service
public class StoreService {
    private static List<Store> stores = new ArrayList<Store>();
    private static int storeCount = 3;

    static {
        stores.add(new Store(1, "DMart", "Open", "10am-9pm",new Location("Dmart_Blr", 40.366633, 74.640832),"Dmart RT Nagar",10,5,50,"low"));
        stores.add(new Store(2, "More Supermarket", "Open", "9am-9pm",new Location("More_Blr", 60.78876, 40.43883),"More Supermarket Domlur",10,10,30,"medium"));
        stores.add(new Store(3, "RelianceFresh", "Open", "10am-7pm",new Location("RelFresh_Blr", 20.686457, 80.34844),"Reliance Fresh MG Road ",12,6,20,"high"));
    }

    public List<Store> retrieveStores(String user) {
        List<Store> filteredStores = new ArrayList<Store>();
        for (Store store : stores) {

                filteredStores.add(store);

        }
        return filteredStores;
    }

    public Store retrieveStore(int id) {
        for (Store store : stores) {
            if (store.getStoreId()==id) {
                return store;
            }
        }
        return null;
    }

    public void updateStore(Store store){
        stores.remove(store);
        stores.add(store);
    }

/*    public void addStore(String name, String desc, Date targetDate,
                         boolean isDone) {
        stores.add(new Store(++storeCount, name, desc, targetDate, isDone));
    }*/

    public void deleteStore(int id) {
        Iterator<Store> iterator = stores.iterator();
        while (iterator.hasNext()) {
            Store store = iterator.next();
            if (store.getStoreId() == id) {
                iterator.remove();
            }
        }
    }
}