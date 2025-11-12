package RateLimiter;

public class Application {
    public static void main(String[] args){
        UserBucketCreater userbucket=new UserBucketCreater(1);
        for(int i=0;i<12;i++){
            userbucket.accessApplication(1);
        }
    }
}
