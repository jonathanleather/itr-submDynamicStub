/*
 * Copyright 2017 HM Revenue & Customs
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

package common

object Constants {

  val minimumRegSafeID = "XA0001234567890"
  val maxAddressRegSafeID = "XA0002345678901"
  val maxContactDetailsRegSafeID = "XA0003456789012"
  val maximumRegSafeID = "XA0004567890123"
  val submissionErrorSafeID = "XA0005678901234"
  val resourceNotFoundSafeID = "XA0006789012345"
  val serverErrorSafeID = "XA0007890123456"
  val serviceUnavailableSafeID = "XA0008901234567"
  val oneOrMoreErrors = "Your submission contains one or more errors"
  val invalidJsonMessageReceived = "Invalid JSON message received"
  val err001 = "REGIME missing or invalid"
  val err002 = "SAP_NUMBER missing or invalid"
  val err003 = "Request could not be processed on remote endpoint"
  val err004 = "Duplicate submission acknowledgement reference from remote endpoint returned"
  val err999 = "Service unavailable"
  val forbidden = "Forbidden"
  val resourceNotFound = "Resource not found"
  val serverError = "Server error"
  val serviceUnavailable = "Service unavailable"

}
