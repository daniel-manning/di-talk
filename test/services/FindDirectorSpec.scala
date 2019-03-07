package services

import models.Movie
import org.scalatest.FlatSpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.Application
import play.api.inject.guice.GuiceApplicationBuilder
import play.api.inject.bind
import fixtures.TestLeoneMovieFinder

class FindDirectorSpec extends FlatSpec with GuiceOneAppPerSuite {



  override implicit lazy val app: Application = GuiceApplicationBuilder()
    .overrides(bind[MovieFinder].to(classOf[TestLeoneMovieFinder]))
    //.configure(encryptionConfig)
    .build()


     "MovieLister" should "find films by a particular director" in {
       val lister = app.injector.instanceOf[MovieLister]

       val moviesOfLeone   = lister.moviesDirectedBy("Sergio Leone")
       assert(moviesOfLeone.contains(Movie("The Good, the Bad and the Ugly", 1966, "Sergio Leone")))
     }

}
