import java.util.Comparator;


abstract class SortByCategoryResult implements Comparator {

public int compareButterfly(Competitor o1, Competitor o2) {
        Competitor a = (Competitor) o1;
        Competitor b = (Competitor) o2;

    if (a.getPR_butterfly()[0] > b.getPR_butterfly()[0]) return 1;
    if (b.getPR_butterfly()[0] > a.getPR_butterfly()[0]) return -1;

    else if (a.getPR_butterfly()[0] == b.getPR_butterfly()[0]) {

        if (a.getPR_butterfly()[1] <  b.getPR_butterfly()[0]) return 1;
        if (b.getPR_butterfly()[1] <  a.getPR_butterfly()[0]) return -1;
        return 0;

        }
    return 0;
    }


    public int compareCrawl(Competitor o1, Competitor o2) {
        Competitor a = (Competitor) o1;
        Competitor b = (Competitor) o2;

        if (a.getPR_crawl()[0] > b.getPR_crawl()[0]) return 1;
        if (b.getPR_crawl()[0] > a.getPR_crawl()[0]) return -1;

        else if (a.getPR_crawl()[0] == b.getPR_crawl()[0]) {

            if (a.getPR_crawl()[1] <  b.getPR_crawl()[0]) return 1;
            if (b.getPR_crawl()[1] <  a.getPR_crawl()[0]) return -1;
            return 0;

        }
        return 0;
    }

    public int compareBackCrawl(Competitor o1, Competitor o2) {
        Competitor a = (Competitor) o1;
        Competitor b = (Competitor) o2;

        if (a.getPR_back_crawl()[0] > b.getPR_back_crawl()[0]) return 1;
        if (b.getPR_back_crawl()[0] > a.getPR_back_crawl()[0]) return -1;

        else if (a.getPR_back_crawl()[0] == b.getPR_back_crawl()[0]) {

            if (a.getPR_back_crawl()[1] <  b.getPR_back_crawl()[0]) return 1;
            if (b.getPR_back_crawl()[1] <  a.getPR_back_crawl()[0]) return -1;
            return 0;

        }
        return 0;
    }

    public int compareBreast(Competitor o1, Competitor o2) {
        Competitor a = (Competitor) o1;
        Competitor b = (Competitor) o2;

        if (a.getPR_breast()[0] > b.getPR_breast()[0]) return 1;
        if (b.getPR_breast()[0] > a.getPR_breast()[0]) return -1;

        else if (a.getPR_breast()[0] == b.getPR_breast()[0]) {

            if (a.getPR_breast()[1] <  b.getPR_breast()[0]) return 1;
            if (b.getPR_breast()[1] <  a.getPR_breast()[0]) return -1;
            return 0;

        }
        return 0;
    }
}
