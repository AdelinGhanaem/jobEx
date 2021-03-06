package com.clouway.jobex.client.cv;

import com.clouway.jobex.client.navigation.SecuredPlace;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * @author Krasimir Dimitrov (kpackapgo@gmail.com, krasimir.dimitrov@clouway.com)
 */
public class CreateCvPlace extends SecuredPlace {

  public static class Tokenizer implements PlaceTokenizer<CreateCvPlace> {

    public CreateCvPlace getPlace(String token) {
      return new CreateCvPlace();
    }

    public String getToken(CreateCvPlace place) {
      return "createCv";
    }
  }
}
