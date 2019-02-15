package code

import javax.inject.Inject

trait MovieFinder {
 def findAll():List[Movie]
}



trait MovieLister{
  val finder:MovieFinder

  def moviesDirectedBy(director:String):List[Movie] = {
    val allMovies = finder.findAll()
    allMovies.filter(_.director == director)
  }

}

class MovieListerImpl @Inject()(val finder: MovieFinder) extends MovieLister



