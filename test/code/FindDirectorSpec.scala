package code

import org.scalatest.FlatSpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite

class FindDirectorSpec extends FlatSpec with GuiceOneAppPerSuite {

     "MovieLister" should "be empty" in {
       val lister = app.injector.instanceOf[MovieLister]

       val moviesOfLeone   = lister.moviesDirectedBy("Sergio Leone")
       assert(moviesOfLeone.contains(Movie("The Good, the Bad and the Ugly", 1966, "Sergio Leone")))
     }

}
