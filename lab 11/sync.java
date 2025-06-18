class counter{
    int count;
    public void counting(){
        count++;
    }
}

class RT extends Thread{
    int num;
    counter c;
    RT(int num,counter c){
        this.num=num;
        this.c=c;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            c.counting();
        }
    }
}

class sync{
    public static void main(String[] args) throws InterruptedException{
        counter c=new counter();
        RT t1=new RT(0,c);
        RT t2=new RT(1,c);
        t1.start();
        t2.start();
        for(int i=0;i<1000;i++){}
        System.out.println(t1.c.count);
        System.out.println(t2.c.count);
    }
}