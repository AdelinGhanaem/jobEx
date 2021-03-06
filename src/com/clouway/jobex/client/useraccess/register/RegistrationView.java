package com.clouway.jobex.client.useraccess.register;


/**
 * @author Krasimir Dimitrov (kpackapgo@gmail.com, krasimir.dimitrov@clouway.com)
 */
public interface RegistrationView {

  void setPresenter(RegistrationPresenter presenter);

  void successfulRegistrationMessage();

  void userExistsMessage();

  void disableRegisterButton();

  void enableRegisterButton();

  String getEmail();

  String getPassword();
  
  String getRegistrationType();
}
