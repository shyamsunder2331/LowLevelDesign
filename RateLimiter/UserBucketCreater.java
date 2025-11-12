package RateLimiter;
import java.util.*;
public class UserBucketCreater {
    Map<Integer,LeakyBucket> bucket;
    public UserBucketCreater(int id){
        bucket=new HashMap<>();
        bucket.put(id,new LeakyBucket(10));
    }
    public void accessApplication(int id){
        if(bucket.get(id).grantAccess()){
            System.out.println("User has access to the service successfully..");
        }else{
            System.out.println("Service side Load.. Please come after some time.");
        }
    }

}
