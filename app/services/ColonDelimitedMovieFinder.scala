package services

import models.Movie

class ColonDelimitedMovieFinder(fileName:String) extends MovieFinder{
  override def findAll(): List[Movie] = ???
}
