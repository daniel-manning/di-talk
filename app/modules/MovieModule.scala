package modules

import services._
import com.google.inject.AbstractModule

class MovieModule extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[MovieFinder]).to(classOf[AllTheMoviesIveHeardOf])
    bind(classOf[MovieLister]).to(classOf[MovieListerImpl])
  }
}
