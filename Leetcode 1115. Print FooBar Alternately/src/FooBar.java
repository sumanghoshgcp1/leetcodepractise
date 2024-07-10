import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class FooBar {
    private int n;
    
    ReentrantLock lock1= new ReentrantLock();
    Condition condition1 = lock1.newCondition();
    
    Condition condition2 = lock1.newCondition();
    
    int key =1;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
           
			lock1.lock();
			
        	// printFoo.run() outputs "foo". Do not change or remove this line.
			
			while(key!=1)
			{
				condition1.await();
			}
			
			
        	printFoo.run();
        	key=0;
        	condition2.signal();
        	
        	
			
        	
        	
        	lock1.unlock();
        	
        	
        	
        	
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
            // printBar.run() outputs "bar". Do not change or remove this line.
        	
        	lock1.lock();
        	while(key!=0)
        	{
        		condition2.await();
        	}
        	
        	
        	printBar.run();
        	key=1;
        	condition1.signal();
        	
        	
        	lock1.unlock();
        }
    }
}