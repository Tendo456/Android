// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

part of firebase_auth;

class PhoneAuthProvider {
  static const String providerId = 'phone';

  static AuthCredential getCredential({
    @required String verificationId,
    @required String smsCode,
  }) {
    return AuthCredential._(providerId, <String, String>{
      'verificationId': verificationId,
      'smsCode': smsCode,
    });
  }

  // PhoneAuthProvider uses JSON serialization on Android when the SMS code was
  // detected automatically.
  static AuthCredential _getCredentialFromObject({
    @required String jsonObject,
  }) {
    return AuthCredential._(providerId, <String, String>{
      "jsonObject": jsonObject,
    });
  }
}
