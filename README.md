# TeachMeSkills_C27_Lesson_16_HW

## Homework for lesson #16

### 1. **Task #1**

App collects all client's orders. There is a map collection which include:  
    - `keys` - client's passport number;  
    - `client` - class `Client` which contains all client's info including orders: `List<Product>`.  

App allows to print all client's info in a different ways:
    - all pairs `key-value` using `Map.Entry<K, V> entry : map.entrySet()`;  
    - all pairs `key-value` using `Iterator`;  
    - all `keys` using `map.keySet()`;  
    - all `values` using `map.values()`;  

App contains:
- **"Constants"** interface contains passport numbers of all clients;
- **"OrderFactory"** class generate 3 different static list of orders;
- **"DateFactory"** class generate random past date in next format: `dd.MM.yyyy`;
- **"ClientFactory"** class generate 3 different clients;
- **"Product"** is created to define **Product** entity. Includes 2 fields: `price` and `description`.  
Method toString() is overridden;
- **"Client"** is created to define **Client** entity. Includes 5 fields: `passportNumber`, `name`, `age`,  
`registrationDate` and `orderList`. Method toString() is overridden;
- **"MapService"** prints all required `Map` data according 4 ways in task;
- **"Runner"** class is used to generate clients and calls **"MapService"** class.

---