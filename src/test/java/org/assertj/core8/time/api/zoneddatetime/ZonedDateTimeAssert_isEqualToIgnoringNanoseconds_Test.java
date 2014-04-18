/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.core8.time.api.zoneddatetime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.FailureMessages.actualIsNull;
import static org.assertj.core8.time.api.ZonedDateTimeAssert.NULL_DATE_TIME_PARAMETER_MESSAGE;
import static org.assertj.core8.time.api.Assertions.assertThat;
import static java.time.ZoneOffset.UTC;

import org.assertj.core8.time.api.JodaTimeBaseTest;
import org.junit.Test;

import java.time.ZonedDateTime;

public class ZonedDateTimeAssert_isEqualToIgnoringNanoseconds_Test extends JodaTimeBaseTest {

  private final ZonedDateTime refDatetime = ZonedDateTime.of(2000, 1, 1, 0, 0, 1, 0, UTC);

  @Test
  public void should_pass_if_actual_is_equal_to_other_ignoring_nanosecond_fields() {
    assertThat(refDatetime).isEqualToIgnoringNanos(refDatetime.withNano(55));
    assertThat(refDatetime).isEqualToIgnoringNanos(refDatetime.plusNanos(1));
  }

  @Test
  public void should_fail_if_actual_is_not_equal_to_given_datetime_with_nanoseconds_ignored() {
    try {
      assertThat(refDatetime).isEqualToIgnoringNanos(refDatetime.plusSeconds(1));
    } catch (AssertionError e) {
      assertThat(e.getMessage())
          .isEqualTo(
              "\nExpecting:\n  <2000-01-01T00:00:01Z>\nto have same year, month, day, hour, minute and second as:\n  <2000-01-01T00:00:02Z>\nbut had not.");
      return;
    }
    failBecauseExpectedAssertionErrorWasNotThrown();
  }

  @Test
  public void should_fail_as_seconds_fields_are_different_even_if_time_difference_is_less_than_a_second() {
    try {
      assertThat(refDatetime).isEqualToIgnoringNanos(refDatetime.minusNanos(1));
    } catch (AssertionError e) {
      assertThat(e.getMessage())
          .isEqualTo(
              "\nExpecting:\n  <2000-01-01T00:00:01Z>\nto have same year, month, day, hour, minute and second as:\n  <2000-01-01T00:00:00.999999999Z>\nbut had not.");
      return;
    }
    failBecauseExpectedAssertionErrorWasNotThrown();
  }

  @Test
  public void should_fail_if_actual_is_null() {
    expectException(AssertionError.class, actualIsNull());
    ZonedDateTime actual = null;
    assertThat(actual).isEqualToIgnoringNanos(ZonedDateTime.now());
  }

  @Test
  public void should_throw_error_if_given_datetime_is_null() {
    expectIllegalArgumentException(NULL_DATE_TIME_PARAMETER_MESSAGE);
    assertThat(refDatetime).isEqualToIgnoringNanos(null);
  }

}
