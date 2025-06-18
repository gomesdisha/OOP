class thread extends Thread{
    public void run(){
    }
}
class isalive{
    public static void main(String[] args) {
        thread t=new thread();
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        try{t.join();}catch(Exception e){}
        System.out.println(t.isAlive());
    }
}