package fixtures

import models.Movie
import services.MovieFinder

class LeoneFixture {

  val movieList = List(
    Movie("The King of Ads", 1991, "Sergio Leone"),
    Movie("Once Upon a Time in America", 1984, "Sergio Leone"),
    Movie("A Fistful of Dynamite", 1971, "Sergio Leone"),
    Movie("Once Upon a Time in the West", 1968, "Sergio Leone"),
    Movie("The Good, the Bad and the Ugly", 1966, "Sergio Leone"),
    Movie("For a Few Dollars More", 1965, "Sergio Leone"),
    Movie("A Fistful of Dollars", 1964, "Sergio Leone"),
    Movie("The Colossus of Rhodes", 1961, "Sergio Leone")
  )



}

class TestLeoneMovieFinder extends MovieFinder {
  override def findAll(): List[Movie] = new LeoneFixture().movieList
}
