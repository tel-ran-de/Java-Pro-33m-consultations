import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class References {

  public static void main(String[] args) throws InterruptedException {

    Address address = new Address("Germany", "Berlin", "HoultSt", 10, 234786);

    WeakReference<Address> weakReference = new WeakReference<>(address);
//    SoftReference<Address> softReference = new SoftReference<>(address);

    ReferenceQueue<Address> referenceQueue = new ReferenceQueue<>();
    PhantomReference<Address> phantomReference = new PhantomReference<>(address, referenceQueue);
    address = null;
    System.gc();



//    System.out.println(softReference.get().getCity());
    System.out.println(weakReference.get());
    System.out.println(phantomReference.get());
//    final Reference<? extends Address> remove = referenceQueue.remove();
    referenceQueue.remove().get().getCity();
//    System.out.println(referenceQueue.remove().get().getIndex());
//    System.out.println(address1.getIndex());



  }
}
