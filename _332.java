import java.util.*;

public class _332 {
    Map<String, Map<String, Integer>> targets = new HashMap<>();
    List<String> result = new ArrayList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            Map<String, Integer> map;
            if (!targets.containsKey(ticket.get(0))) {
                map = new TreeMap<>();
                map.put(ticket.get(1), 1);
            } else {
                map = targets.get(ticket.get(0));
                map.put(ticket.get(1), map.getOrDefault(ticket.get(1), 0) + 1);
            }
            targets.put(ticket.get(0), map);
        }
        result.add("JFK");
        backTracking(tickets.size());
        return result;
    }
    public boolean backTracking(int ticketNum) {
        if (result.size() == ticketNum + 1) {
            return true;
        }

        Map<String, Integer> map = targets.get(result.get(result.size() - 1));
        if (map != null) {
            for (String to : map.keySet()) {
                if (map.get(to) > 0) {
                    result.add(to);
                    map.put(to, map.get(to) - 1);
                    if (backTracking(ticketNum)) return true;
                    map.put(to, map.get(to) + 1);
                    result.remove(result.size() - 1);
                }
            }
        }
        return false;
    }
}
