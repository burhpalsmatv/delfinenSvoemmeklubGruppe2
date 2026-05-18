package comparator;

import members.Competitor;
import java.util.Comparator;


public class SortByBackCrawlResult implements Comparator<Competitor> {

    public int compare(Competitor o1, Competitor o2) {

        if (o1.getPR_back_crawl()[0] > o2.getPR_back_crawl()[0]) return 1;
        if (o2.getPR_back_crawl()[0] > o1.getPR_back_crawl()[0]) return -1;

        else if (o1.getPR_back_crawl()[0] == o2.getPR_back_crawl()[0]) {

            if (o1.getPR_back_crawl()[1] < o2.getPR_back_crawl()[0]) return 1;
            if (o2.getPR_back_crawl()[1] < o1.getPR_back_crawl()[0]) return -1;
        }
        return 0;
    }
};