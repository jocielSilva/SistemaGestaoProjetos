package br.com.cast.view.home;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends WebPage
{
   private static final long serialVersionUID = 1L;

   public HomePage(final PageParameters parameters)
   {
      add(new HomeForm("formulario"));

   }
}
