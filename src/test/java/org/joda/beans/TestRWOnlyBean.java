/*
 *  Copyright 2001-2011 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans;

import static org.testng.Assert.assertEquals;

import org.joda.beans.gen.RWOnlyBean;
import org.testng.annotations.Test;

/**
 * Test RWOnlyBean.
 */
@Test
public class TestRWOnlyBean extends RWOnlyBean {

    public void test_ro() {
        assertEquals(getRo(), null);
        assertEquals(propertyGet("ro", false), null);
        assertEquals(ro().get(), null);
    }

    @Test(expectedExceptions = UnsupportedOperationException.class)
    public void test_wo() {
        setWo("woo");
        propertyGet("wo", false);
    }

    public void test_manualGet() {
        assertEquals(getManualGet(), "goo");
        assertEquals(propertyGet("manualGet", false), "goo");
        assertEquals(manualGet().get(), "goo");
    }

    public void test_derived() {
        assertEquals(getDerived(), "drv");
        assertEquals(propertyGet("derived", false), "drv");
        assertEquals(derived().get(), "drv");
    }

}