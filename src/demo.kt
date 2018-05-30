import jdk.nashorn.internal.parser.JSONParser
import java.util.*

fun main(args: Array<String>) {

    var obj=HashMap<String,String>()
    for (i in 0..1000) {
        obj.put((Random().nextInt(10000)).toString(),(Random(100).nextLong()).toString())
    }

    var s=JSONParser.quote(obj.toString())
    //print(s)
    //print("hello world \rhai")
    var j=0



    Thread(Runnable {
        while (j<100) {

            print("\rT1 loading "+j)
            Thread.sleep(500)
            j++
        }
    }).start()

    Thread(Runnable {
        while (j<100) {

            print("\rT2 loading "+j)
            Thread.sleep(500)
            j--
        }
    }).start()

}