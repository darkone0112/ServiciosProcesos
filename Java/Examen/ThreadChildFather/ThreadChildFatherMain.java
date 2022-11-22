/**
 * main
 */
public class ThreadChildFatherMain{
    public static void main(String[] args){
        thread thread = new thread();
        threadResta threadResta = new threadResta();
        thread.start();
        threadResta.start();
    }
}