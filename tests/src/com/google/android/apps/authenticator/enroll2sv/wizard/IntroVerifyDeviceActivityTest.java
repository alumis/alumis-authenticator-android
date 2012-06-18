/*
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.apps.authenticator.enroll2sv.wizard;

import com.google.android.apps.authenticator.AuthenticatorActivity;

import android.content.Intent;

/**
 * Unit tests for {@link IntroVerifyDeviceActivity}.
 *
 * @author klyubin@google.com (Alex Klyubin)
 */
public class IntroVerifyDeviceActivityTest
    extends WizardPageActivityTestBase<IntroVerifyDeviceActivity> {

  public IntroVerifyDeviceActivityTest() {
    super(IntroVerifyDeviceActivity.class);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();

    setWizardStateInActivityIntent(new WizardState());
  }

  public void testBackKeyFinishesActivity() throws Exception {
    assertBackKeyFinishesActivity();
  }

  public void testLeftButtonFinishesActivity() throws Exception {
    assertLeftButtonPressFinishesActivity();
  }

  public void testRightButtonExitsWizard() throws Exception {
    Intent intent = pressRightButtonAndCaptureActivityStartIntent();
    assertIntentForClassInTargetPackage(AuthenticatorActivity.class, intent);
    assertTrue(getActivity().isFinishing());
  }
}