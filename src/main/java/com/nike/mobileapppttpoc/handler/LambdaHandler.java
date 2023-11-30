package com.nike.mobileapppttpoc.handler;

import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.nike.mobileapppttpoc.MobileAppPttPocApplication;
import com.amazonaws.serverless.proxy.spring.SpringLambdaContainerHandler;

public class LambdaHandler implements RequestHandler<AwsProxyRequest, AwsProxyResponse> {

  private static SpringLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;

  static {
    try {
      handler = SpringLambdaContainerHandler.getAwsProxyHandler(MobileAppPttPocApplication.class);
    } catch (ContainerInitializationException ex) {
      throw new RuntimeException("Unable to load spring boot application", ex);
    }
  }

  @Override
  public AwsProxyResponse handleRequest(AwsProxyRequest input, Context context) {
    return handler.proxy(input, context);
  }

}
