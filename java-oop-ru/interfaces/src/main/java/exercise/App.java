package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> aparts, int listLength) {
        List<String> apartsList = aparts.stream()
                .sorted((h1, h2) -> Double.compare(h1.getArea(), h2.getArea()))
                .map(Home::toString)
			.limit(listLength)
                .toList();

        return apartsList;
    }
}
// END
