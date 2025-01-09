package collectionDemo.comparableComparatorExample.studentsCompare;

import java.util.Comparator;

public class IdComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        if(o1.getId() == o2.getId()){
            return 0;
        }else if(o1.getId() > o2.getId()){
            return 1;
        }else{
            return -1;
        }
    }
}
