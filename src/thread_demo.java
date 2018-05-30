import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class thread_demo {



    public static void main(String[] args) {

        ExecutorService e=new ScheduledThreadPoolExecutor(10);
        e.execute(new Runnable() {
            @Override
            public void run() {

            }
        });

    }



}
