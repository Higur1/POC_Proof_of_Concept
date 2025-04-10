package CloseAllResources;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class CloseResources {
    public static void main(String[] args) {
        BufferedWriter obj1 = new BufferedWriter(null);
        OutputStreamWriter obj2 = new OutputStreamWriter(null);

        var list = List.of(obj1, obj2);
        //closeAll(list); //not work because send a list of Writer and not Closeable
        closeAllGeneric(list);
    }

    //add the wildcard to Generic and extends Closeable and get a list of Generic
    private static <T extends Closeable> void closeAllGeneric(List<T> objects) {
        objects.forEach(
                o -> {
                    try {
                        o.close();
                    } catch (IOException e) {
                        //ignore
                    }
                }
        );
    }

    //not work because receives a Closeable list
    private static void closeAll(List<Closeable> objects) {
        objects.forEach(
                o -> {
                    try {
                        o.close();
                    } catch (IOException e) {
                        //ignore
                    }
                }
        );
    }
}
