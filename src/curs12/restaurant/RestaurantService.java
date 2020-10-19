package curs12.restaurant;

import java.util.*;


public class RestaurantService {
    private final List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantService(Collection<Restaurant> restaurants) {
        if (restaurants != null) {
            this.restaurants.addAll(restaurants);
        }
    }

    public List<Restaurant> getRestaurantsInCity(String city) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getCity().equalsIgnoreCase(city)) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public List<Restaurant> getRestaurantsWithTypes(RestaurantType type) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getType().equals(type)) {
                result.add(restaurant);
            }
        }
        return result;
    }


    public Map<String, String> mapRestaurantToCity() {
        Map<String, String> result = new HashMap<>();

        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getCity());
        }
        return result;
    }

    public Map<String, RestaurantType> mapRestaurantToType() {
        Map<String, RestaurantType> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getType());
        }
        return result;
    }


    public Map<Integer, List<String>> mapRatingToRestaurant() {
        Map<Integer, List<String>> result = new HashMap<>();

        for (Restaurant restaurant : restaurants) {
            List<String> names = result.get(restaurant.getRating());

            if (names == null) {
                names = new ArrayList<>();
                result.put(restaurant.getRating(), names);
            }
            names.add(restaurant.getName());

        }
        return result;
    }

    public Map<String, List<Restaurant>> mapCityToRestaurants() {
        Map<String, List<Restaurant>> result = new HashMap<>();

        for (Restaurant restaurant : restaurants) {
            List<Restaurant> resultRestaurants = result.get(restaurant.getCity());

            if (resultRestaurants == null) {
                resultRestaurants = new ArrayList<>();
                result.put(restaurant.getCity(), resultRestaurants);
            }
            resultRestaurants.add(restaurant);

        }
        return result;
    }

}
