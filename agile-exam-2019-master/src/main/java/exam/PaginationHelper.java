package exam;

import java.util.ArrayList;
import java.util.List;

public class PaginationHelper<I> {
	private List<I> list = new ArrayList<I>();
	private int collection1 ;
	private int itemsPerPage1;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
    	list.addAll(collection);
    	collection1 = itemsPerPage;
     }

    public int itemCount() {
    	itemsPerPage1 = list.size();
    	return itemsPerPage1;
    }

    public int pageCount() {
    	int count,score;
    	itemsPerPage1= list.size();
    	score = itemsPerPage1/collection1;
    	if (score == 0) {
    		count = score;
		}else {
			count = score+1;
		}
    	return count;
    }

    public int pageItemCount(int pageIndex) {
        int rest,m;
        itemsPerPage1 = list.size();
        rest = itemsPerPage1-(pageIndex)*collection1;
        m = pageCount();
		if (pageIndex >= m || pageIndex < 0) {
			itemsPerPage1 = -1;
		}else {
			if (rest >= collection1) {
				itemsPerPage1 = collection1;
			} else{
				itemsPerPage1 = rest;
			}
		}
        return itemsPerPage1;
    }

    public int pageIndex(int itemIndex) {
        int num,index;
        num = list.size();
        if (itemIndex>num || itemIndex<0) {
			index = -1;
		}else {
			index=itemIndex/collection1;
        }
        return index;
    }
}
