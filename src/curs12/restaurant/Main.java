package curs12.restaurant;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestaurantService service = new RestaurantService(List.of(
                new Restaurant("Dock", "Oradea", RestaurantType.FUSION, 4),
                new Restaurant("Rivo", "Oradea", RestaurantType.MEDITERANEEAN, 3),
                new Restaurant("Pizza Hut", "Bucuresti", RestaurantType.GREEK, 2),
                new Restaurant("Indigo", "Cluj", RestaurantType.FUSION, 3),
                new Restaurant("Bricks", "Cluj", RestaurantType.ROMANIAN, 4),
                new Restaurant("Flavours", "Oradea", RestaurantType.ROMANIAN, 5),
                new Restaurant("Spoon", "Oradea", RestaurantType.ROMANIAN, 4),
                new Restaurant("Traditional", "Bucuresti", RestaurantType.ROMANIAN, 3)
        ));

        printRestaurants("Restaurants in Oradea", service.getRestaurantsInCity("Oradea"));
        System.out.println();
        printRestaurants("Restaurants of type", service.getRestaurantsWithTypes(RestaurantType.ROMANIAN));
        System.out.println();
        System.out.println(service.mapRestaurantToCity());
        System.out.println();
        System.out.println(service.mapRestaurantToType());
        System.out.println();
        System.out.println(service.getRestaurantsInCity("Oradea"));
        System.out.println();
        System.out.println(service.mapRatingToRestaurant());
        System.out.println();
        System.out.println(service.mapCityToRestaurants());


    }


    private static void printRestaurants(String description, List<Restaurant> restaurants) {
        System.out.println(description + ": ");
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant.getName() + " -" + restaurant.getCity() + "-" + restaurant.getType() + "-" + restaurant.getRating());
        }
    }
}
