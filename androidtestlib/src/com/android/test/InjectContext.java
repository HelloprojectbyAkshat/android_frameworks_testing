/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.test;

import android.app.Instrumentation;
import android.content.Context;
import android.test.AndroidTestCase;

import junit.framework.Test;

import org.junit.Before;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Use this to inject a {@link Context} representing {@link Instrumentation#getTargetContext()}
 * into your JUnit4-style test.
 * <p/>
 * To use, just add the correct annotation to an {@link Context} field like this:
 * <pre>
 *     &#64;InjectContext public Context mMyContext;
 * </pre>
 * The test runner will set the value of this field with the {@link Instrumentation} after
 * object construction but before any {@link Before} methods are called.
 * <p/>
 * Declaring this in a JUnit3 test (ie a class that is a {@link Test}) will have no effect.
 * Use {@link AndroidTestCase} instead for JUnit3 style tests.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InjectContext {

}
