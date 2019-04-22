package edu.dmacc.codedsm.usegit;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzRepeatMapRepository implements MapRepository {

    private Map<Integer, Result> storage = new HashMap<>();


    @Override

    public String toString() {
        return "FizzBuzzRepeatMapRepository {" + "storage = " + storage + '}';
    }
    public void save(Result result) {
        storage.put(1, result);

    }
}
