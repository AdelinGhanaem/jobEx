package com.clouway.jobex.inject;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.requestfactory.server.DefaultExceptionHandler;
import com.google.web.bindery.requestfactory.server.RequestFactoryServlet;

/**
 * @author Krasimir Dimitrov (kpackapgo@gmail.com, krasimir.dimitrov@clouway.com)
 */

@Singleton
public class JobExRequestFactoryServlet extends RequestFactoryServlet {

  @Inject
  public JobExRequestFactoryServlet(JobExServiceLayerDecorator decorator) {
    super(new DefaultExceptionHandler(), decorator);
  }
}