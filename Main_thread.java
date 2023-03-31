class ListLoader{
    int arr[];
    public void loadlist(int startNum,int endNum){
        for(int i=startNum;i<endNum;i++){
            try{
                Thread.sleep(50);
            }catch(Exception e){}
                }
            }
        }
class LoaderThread implements Runnable{
ListLoader list1;
int startNum;
int endNum;
int arr[];
public LoaderThread(int startNum,int endNum,int arr[]){
    this.startNum=startNum;
    this.endNum=endNum;
    this.arr=arr;
}
public void run(){
    for(int i=startNum;i<endNum;i++){
    arr[i]=i;
    }
}
}
    public class Main_thread{
    public static void main(String[] args)throws Exception {
        ListLoader list1=new ListLoader();
        long starttime=System.currentTimeMillis();
        System.out.println("start time "+starttime);
        list1.loadlist(0,100);
        long endtime=System.currentTimeMillis();
        System.out.println("endtime "+endtime);
        System.out.println("Time Taken " +(endtime-starttime)+ " mini Seccond");
        int arr[]=new int[100];
        LoaderThread list2=new LoaderThread(0, 50, arr);
        LoaderThread list3=new LoaderThread(51, 100, arr);
        Thread t1=new Thread();
        Thread t2=new Thread();
        t1.start();
        t2.start();
        t1.join();
        t1.join();
    }
    }
