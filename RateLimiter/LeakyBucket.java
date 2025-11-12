package RateLimiter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
public class LeakyBucket implements Ratelimiter{
    BlockingQueue<Integer> queue;
    public LeakyBucket(int cap){
        this.queue=new LinkedBlockingQueue<>(cap);
    }
    @Override
    public boolean grantAccess(){
        if(queue.remainingCapacity()>0){
            queue.add(1);
            return true;
        }
        return false;
    }
}