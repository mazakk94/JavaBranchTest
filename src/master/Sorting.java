package master;

public class Sorting {
    int[] list = new int[10];
    
    public Sorting(){
       
    }
    
    public Sorting(int[] list){
        this.list = list;
    }
    
    public int[] bubbleSort(int[] list){
        for(int i = 0; i < list.length; i++){
            for(int j = i; j < list.length-1; j++){
                if(list[j] > list[j+1]){
                    swap(list[j],list[j+1]);
                }
            }
        }
        return list;
    }
    
    public int[] getList(int[] list){
        return list;
    }
    
    public void swap(Integer list, Integer list0) {
        Integer temp;
        temp = list;
        list = list0;
        list0 = temp;
    }
    
}
