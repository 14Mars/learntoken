package testapp1.learnconcurrent.learnfuturetask;


import java.sql.SQLOutput;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(
                () -> System.out.println(Thread.currentThread().getName() + "--- come in")
        );

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(
                () -> System.out.println(Thread.currentThread().getName() + "--- come in")
        );
        future1.join();


    }

}
