package code

import com.google.inject.AbstractModule

class MovieModule extends AbstractModule {
  override def configure(): Unit = {
    //bind(classOf[TemplateRenderer]).to(classOf[LocalTemplateRenderer])
  }
}
