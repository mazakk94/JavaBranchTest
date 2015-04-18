package master;

public class Main {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        
        /*int[] list = {1,3,4,5,2,3,4,6,4,-1};
        
       
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]+",");
        }
        
        
        int[] list2 = sort.bubbleSort(list);
        
        System.out.println();
        for(int i = 0; i < list2.length; i++){
            System.out.print(list2[i]+",");
        }*/
        Sorting sort = new Sorting();
        Integer[] list3 = {1,2};
        sort.swap(list3[0], list3[1]);
        System.out.print(list3[0]+ ","+ list3[1]);
        
    }
}
