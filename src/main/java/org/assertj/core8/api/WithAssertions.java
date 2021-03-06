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
package org.assertj.core8.api;

import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.assertj.core.api.AbstractBooleanArrayAssert;
import org.assertj.core.api.AbstractBooleanAssert;
import org.assertj.core.api.AbstractByteArrayAssert;
import org.assertj.core.api.AbstractByteAssert;
import org.assertj.core.api.AbstractCharArrayAssert;
import org.assertj.core.api.AbstractCharSequenceAssert;
import org.assertj.core.api.AbstractCharacterAssert;
import org.assertj.core.api.AbstractClassAssert;
import org.assertj.core.api.AbstractComparableAssert;
import org.assertj.core.api.AbstractDateAssert;
import org.assertj.core.api.AbstractDoubleArrayAssert;
import org.assertj.core.api.AbstractDoubleAssert;
import org.assertj.core.api.AbstractFileAssert;
import org.assertj.core.api.AbstractFloatArrayAssert;
import org.assertj.core.api.AbstractFloatAssert;
import org.assertj.core.api.AbstractInputStreamAssert;
import org.assertj.core.api.AbstractIntArrayAssert;
import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.AbstractIterableAssert;
import org.assertj.core.api.AbstractListAssert;
import org.assertj.core.api.AbstractLongArrayAssert;
import org.assertj.core.api.AbstractLongAssert;
import org.assertj.core.api.AbstractMapAssert;
import org.assertj.core.api.AbstractObjectArrayAssert;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.AbstractShortArrayAssert;
import org.assertj.core.api.AbstractShortAssert;
import org.assertj.core.api.AbstractThrowableAssert;
import org.assertj.core.api.AssertDelegateTarget;
import org.assertj.core.api.Condition;
import org.assertj.core.api.filter.Filters;
import org.assertj.core.condition.DoesNotHave;
import org.assertj.core.condition.Not;
import org.assertj.core.data.Index;
import org.assertj.core.data.MapEntry;
import org.assertj.core.data.Offset;
import org.assertj.core.groups.Properties;
import org.assertj.core.groups.Tuple;

/**
 *
 * A unified entry point to all non-deprecated assertions from both the new Java 8 core API and the pre-Java 8 core API.
 *
 * As a convenience, the methods are defined in an interface so that no static imports are necessary if the test class
 * implements this interface.
 *
 * Based on an idea by David Gageot :
 *
 * http://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/
 *
 * @author Alan Rothkopf
 *
 */
public interface WithAssertions {

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#offset(Float)}
   */
  default public Offset<Float> offset(final Float value) {
	return org.assertj.core.api.Assertions.offset(value);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#offset(Double)}
   */
  default public Offset<Double> offset(final Double value) {
	return org.assertj.core.api.Assertions.offset(value);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#entry(Object,Object)}
   */
  default public MapEntry entry(final Object key, final Object value) {
	return org.assertj.core.api.Assertions.entry(key, value);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#fail(String)}
   */
  default public void fail(final String failureMessage) {
	org.assertj.core.api.Assertions.fail(failureMessage);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#fail(String,Throwable)}
   */
  default public void fail(final String failureMessage, final Throwable realCause) {
	org.assertj.core.api.Assertions.fail(failureMessage, realCause);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#not(Condition)}
   */
  default public <T> Not<T> not(final Condition<? super T> condition) {
	return org.assertj.core.api.Assertions.not(condition);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#allOf(Iterable<? extends Condition>)}
   */
  default public <T> Condition<T> allOf(final Iterable<? extends Condition<? super T>> conditions) {
	return org.assertj.core.api.Assertions.allOf(conditions);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#allOf(Condition[])}
   */
  default public <T> Condition<T> allOf(final Condition<? super T>... conditions) {
	return org.assertj.core.api.Assertions.allOf(conditions);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(T[])}
   */
  default public <T> AbstractObjectArrayAssert<?, T> assertThat(final T[] actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(AssertDelegateTarget)}
   */
  default public <T extends AssertDelegateTarget> T assertThat(final T assertion) {
	return org.assertj.core.api.Assertions.assertThat(assertion);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Map)}
   */
  default public <K, V> AbstractMapAssert<?, ? extends Map<K, V>, K, V> assertThat(final Map<K, V> actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(short)}
   */
  default public AbstractShortAssert<?> assertThat(final short actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(long)}
   */
  default public AbstractLongAssert<?> assertThat(final long actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Long)}
   */
  default public AbstractLongAssert<?> assertThat(final Long actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(long[])}
   */
  default public AbstractLongArrayAssert<?> assertThat(final long[] actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(T)}
   */
  default public <T> AbstractObjectAssert<?, T> assertThat(final T actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(String)}
   */
  default public AbstractCharSequenceAssert<?, String> assertThat(final String actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Date)}
   */
  default public AbstractDateAssert<?> assertThat(final Date actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Throwable)}
   */
  default public AbstractThrowableAssert<?, ? extends Throwable> assertThat(final Throwable actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(BigDecimal)}
   */
  default public AbstractBigDecimalAssert<?> assertThat(final BigDecimal actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(CharSequence)}
   */
  default public AbstractCharSequenceAssert<?, ? extends CharSequence> assertThat(final CharSequence actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(short[])}
   */
  default public AbstractShortArrayAssert<?> assertThat(final short[] actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Short)}
   */
  default public AbstractShortAssert<?> assertThat(final Short actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Class)}
   */
  default public AbstractClassAssert<?> assertThat(final Class<?> actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Character)}
   */
  default public AbstractCharacterAssert<?> assertThat(final Character actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(char[])}
   */
  default public AbstractCharArrayAssert<?> assertThat(final char[] actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(char)}
   */
  default public AbstractCharacterAssert<?> assertThat(final char actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Comparable)}
   */
  default public <T extends Comparable<? super T>> AbstractComparableAssert<?, T> assertThat(final T actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Iterable)}
   */
  default public <T> AbstractIterableAssert<?, ? extends Iterable<T>, T> assertThat(final Iterable<T> actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Iterator)}
   */
  default public <T> AbstractIterableAssert<?, ? extends Iterable<T>, T> assertThat(final Iterator<T> actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Boolean)}
   */
  default public AbstractBooleanAssert<?> assertThat(final Boolean actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(boolean)}
   */
  default public AbstractBooleanArrayAssert<?> assertThat(final boolean[] actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(byte)}
   */
  default public AbstractByteAssert<?> assertThat(final byte actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Byte)}
   */
  default public AbstractByteAssert<?> assertThat(final Byte actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(byte[])}
   */
  default public AbstractByteArrayAssert<?> assertThat(final byte[] actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(boolean)}
   */
  default public AbstractBooleanAssert<?> assertThat(final boolean actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(float)}
   */
  default public AbstractFloatAssert<?> assertThat(final float actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(InputStream)}
   */
  default public AbstractInputStreamAssert<?, ? extends InputStream> assertThat(final InputStream actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(File)}
   */
  default public AbstractFileAssert<?> assertThat(final File actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(int[])}
   */
  default public AbstractIntArrayAssert<?> assertThat(final int[] actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Float)}
   */
  default public AbstractFloatAssert<?> assertThat(final Float actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core8.api.Assertions#assertThat(int)}
   */
  default public IntegerAssert assertThat(final int actual) {
	return Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(float[])}
   */
  default public AbstractFloatArrayAssert<?> assertThat(final float[] actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Integer)}
   */
  default public AbstractIntegerAssert<?> assertThat(final Integer actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(double)}
   */
  default public AbstractDoubleAssert<?> assertThat(final double actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(Double)}
   */
  default public AbstractDoubleAssert<?> assertThat(final Double actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(List)}
   */
  default public <T> AbstractListAssert<?, ? extends List<T>, T> assertThat(final List<T> actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#assertThat(double[])}
   */
  default public AbstractDoubleArrayAssert<?> assertThat(final double[] actual) {
	return org.assertj.core.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#extractProperty(String)}
   */
  default public Properties<Object> extractProperty(final String propertyName) {
	return org.assertj.core.api.Assertions.extractProperty(propertyName);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#extractProperty(String,Class)}
   */
  default public <T> Properties<T> extractProperty(final String propertyName, final Class<T> propertyType) {
	return org.assertj.core.api.Assertions.extractProperty(propertyName, propertyType);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#tuple(Object[])}
   */
  default public Tuple tuple(final Object... values) {
	return org.assertj.core.api.Assertions.tuple(values);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#atIndex(int)}
   */
  default public Index atIndex(final int actual) {
	return org.assertj.core.api.Assertions.atIndex(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#within(Double)}
   */
  default public Offset<Double> within(final Double actual) {
	return org.assertj.core.api.Assertions.within(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#within(BigDecimal)}
   */
  default public Offset<BigDecimal> within(final BigDecimal actual) {
	return org.assertj.core.api.Assertions.within(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#within(Float)}
   */
  default public Offset<Float> within(final Float actual) {
	return org.assertj.core.api.Assertions.within(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#anyOf(Iterable)}
   */
  default public <T> Condition<T> anyOf(final Iterable<? extends Condition<? super T>> conditions) {
	return org.assertj.core.api.Assertions.anyOf(conditions);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#anyOf(Condition[])}
   */
  default public <T> Condition<T> anyOf(final Condition<? super T>... conditions) {
	return org.assertj.core.api.Assertions.anyOf(conditions);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#doesNotHave(Condition)}
   */
  default public <T> DoesNotHave<T> doesNotHave(final Condition<? super T> condition) {
	return org.assertj.core.api.Assertions.doesNotHave(condition);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#contentOf(File,String)}
   */
  default public String contentOf(final File file, final String charsetName) {
	return org.assertj.core.api.Assertions.contentOf(file, charsetName);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#contentOf(File)}
   */
  default public String contentOf(final File actual) {
	return org.assertj.core.api.Assertions.contentOf(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#contentOf(File,Charset)}
   */
  default public String contentOf(final File file, final Charset charset) {
	return org.assertj.core.api.Assertions.contentOf(file, charset);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#linesOf(File)}
   */
  default public List<String> linesOf(final File actual) {
	return org.assertj.core.api.Assertions.linesOf(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#linesOf(File,String)}
   */
  default public List<String> linesOf(final File file, final String charsetName) {
	return org.assertj.core.api.Assertions.linesOf(file, charsetName);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#linesOf(File,Charset)}
   */
  default public List<String> linesOf(final File actual, final Charset arg1) {
	return org.assertj.core.api.Assertions.linesOf(actual, arg1);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#setRemoveAssertJRelatedElementsFromStackTrace}
   */
  default public void setRemoveAssertJRelatedElementsFromStackTrace(final boolean actual) {
	org.assertj.core.api.Assertions.setRemoveAssertJRelatedElementsFromStackTrace(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#failBecauseExceptionWasNotThrown}
   */
  default public void failBecauseExceptionWasNotThrown(final Class<? extends Throwable> exceptionClass) {
	org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown(exceptionClass);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#setAllowExtractingPrivateFields}
   */
  default public void setAllowExtractingPrivateFields(final boolean actual) {
	org.assertj.core.api.Assertions.setAllowExtractingPrivateFields(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#registerCustomDateFormat(DateFormat)}
   */
  default public void registerCustomDateFormat(final DateFormat actual) {
	org.assertj.core.api.Assertions.registerCustomDateFormat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#registerCustomDateFormat(String)}
   */
  default public void registerCustomDateFormat(final String actual) {
	org.assertj.core.api.Assertions.registerCustomDateFormat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#useDefaultDateFormatsOnly}
   */
  default public void useDefaultDateFormatsOnly() {
	org.assertj.core.api.Assertions.useDefaultDateFormatsOnly();
  }

  /**
   * Delegate call to {@link org.assertj.core8.api.Assertions#assertThat(ZonedDateTime)}
   */
  default public ZonedDateTimeAssert assertThat(final ZonedDateTime actual) {
	return org.assertj.core8.api.Assertions.assertThat(actual);
  }

  /**
   * Delegate call to {@link org.assertj.core8.api.Assertions#assertThat(Optional)}
   */
  default public <T> OptionalAssert<T> assertThat(final Optional<T> optional) {
	return org.assertj.core8.api.Assertions.assertThat(optional);
  }

  /**
   * Delegate call to {@link org.assertj.core8.api.Assertions#assertThat(LocalDateTime)}
   */
  default public LocalDateTimeAssert assertThat(final LocalDateTime localDateTime) {
	return org.assertj.core8.api.Assertions.assertThat(localDateTime);
  }

  // --------------------------------------------------------------------------------------------------
  // Filter methods : not assertions but here to have a complete entry point to all AssertJ features.
  // --------------------------------------------------------------------------------------------------

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#filter(E[])}
   */
  default public <E> Filters<E> filter(final E[] array) {
	return org.assertj.core.api.Assertions.filter(array);
  }

  /**
   * Delegate call to {@link org.assertj.core.api.Assertions#filter(Iterable)}
   */
  default public <E> Filters<E> filter(final Iterable<E> iterableToFilter) {
	return org.assertj.core.api.Assertions.filter(iterableToFilter);
  }
}
