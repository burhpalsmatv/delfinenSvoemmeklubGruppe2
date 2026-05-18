package comparator;

import members.Competitor;
import java.util.Comparator;

public class SortByBreastResult implements Comparator<Competitor> {

    public int compare(Competitor o1, Competitor o2) {

        if (o1.getPR_breast()[0] > o2.getPR_breast()[0]) return 1;
        if (o2.getPR_breast()[0] > o1.getPR_breast()[0]) return -1;

        else if (o1.getPR_breast()[0] == o2.getPR_breast()[0]) {

            if (o1.getPR_breast()[1] < o2.getPR_breast()[0]) return 1;
            if (o2.getPR_breast()[1] < o1.getPR_breast()[0]) return -1;
        }
        return 0;
    }
};