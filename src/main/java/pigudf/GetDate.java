package pigudf;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;
import org.joda.time.DateTime;

import java.io.IOException;

public class GetDate extends EvalFunc<String> {
    public String exec(Tuple input) throws IOException {
        if (input == null || input.size() < 1 || input.get(0) == null) {
            return null;
        }

        return ((DateTime) input.get(0)).toLocalDate().toString();
    }
}
