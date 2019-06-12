package exam;

import java.util.ArrayList;
import java.util.List;

public class PaginationHelper<I> {
	private List<I> list = new ArrayList<I>();
	private int collection1 ;
	private int itemsPerPage1;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
    	
    	list.addAll(collection);
    	itemsPerPage1 = itemsPerPage;
     }

    public int itemCount() {
    	
    	itemsPerPage1 = list.size();
    	return itemsPerPage1;
    }

    public int pageCount() {
    	int n,s;
    	itemsPerPage1 = list.size();
    	s = itemsPerPage1/collection1;
    	if (s == 0) {
    		n = s;
		}else {
			n= s+1;
		}
    	return n;
    }

    public int pageItemCount(int pageIndex) {
        int r,m;
        itemsPerPage1 = list.size();
        r = itemsPerPage1-(pageIndex)*collection1;
        m = pageCount();
		if (pageIndex >= m || pageIndex < 0) {
			itemsPerPage1 = -1;
		}else {
			if (r >= collection1) {
				itemsPerPage1= collection1;
			} else{
				itemsPerPage1= r;
			}
		}
        return itemsPerPage1;
    }

    public int pageIndex(int itemIndex) {
        int number,index;
        number = list.size();
        if (itemIndex>number || itemIndex<0) {
			index = -1;
		}else {
			index=itemIndex/collection1;
        }
        return index;
    }
}