package com.clouway.jobex.server.cv;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public class CvsServiceImplTest {


  @Mock
  CVRepository repository;

  CvsServiceImpl service;
  private String username = "user";

  @Before
  public void setUp() throws Exception {
    initMocks(this);
    service = new CvsServiceImpl(repository);

  }

  @Test
  public void returnsCreatedCvs() {

    List<CV> cvs = new ArrayList<CV>();

    cvs.add(new CV());

    cvs.add(new CV());

    when(repository.getCreatedCVs(username)).thenReturn(cvs);

    List<CV> returnedList = service.fetchCreatedCVs(username);

    verify(repository).getCreatedCVs(username);

    assertThat(returnedList, is(notNullValue()));

    assertThat(returnedList.size(), is(2));
  }


  @Test
  public void addsCvInRepository() {

    CV cv = new CV();

    cv.setEmail("mail@mail.com");

    String username = "username";

    service.add(username, cv);

    verify(repository).save(username, cv);

  }



}