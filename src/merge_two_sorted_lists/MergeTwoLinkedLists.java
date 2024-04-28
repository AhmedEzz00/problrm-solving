package merge_two_sorted_lists;

import list_node.ListNode;

public class MergeTwoLinkedLists {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode first= null;
            if(list1==null && list2== null)
                return null;

            if(list1== null)
                return list2;

            if(list2 == null)
                return list1;

            if (list1.getVal()< list2.getVal()){
                first.setVal(list1.getVal());
                list1= list1.getNext();
                first.setNext(mergeTwoLists(list1, list2));
            }else {
                first.setVal(list2.getVal());
                list2= list2.getNext();
                first.setNext(mergeTwoLists(list1,list2));
            }
            return first;
        }

}
