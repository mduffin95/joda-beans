/*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.beans.gen;

import java.util.Map;

import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public abstract class MidAbstractResult<S extends Address> extends AbstractResult<S> {

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code MidAbstractResult}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static MidAbstractResult.Meta meta() {
        return MidAbstractResult.Meta.INSTANCE;
    }
    /**
     * The meta-bean for {@code MidAbstractResult}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R extends Address> MidAbstractResult.Meta<R> metaMidAbstractResult(Class<R> cls) {
        return MidAbstractResult.Meta.INSTANCE;
    }
    static {
        JodaBeanUtils.registerMetaBean(MidAbstractResult.Meta.INSTANCE);
    }

    @SuppressWarnings("unchecked")
    @Override
    public MidAbstractResult.Meta<S> metaBean() {
        return MidAbstractResult.Meta.INSTANCE;
    }

    @Override
    protected Object propertyGet(String propertyName, boolean quiet) {
        return super.propertyGet(propertyName, quiet);
    }

    @Override
    protected void propertySet(String propertyName, Object newValue, boolean quiet) {
        super.propertySet(propertyName, newValue, quiet);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            return super.equals(obj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash ^ super.hashCode();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code MidAbstractResult}.
     */
    public static class Meta<S extends Address> extends AbstractResult.Meta<S> {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
            this, (DirectMetaPropertyMap) super.metaPropertyMap());

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        public BeanBuilder<? extends MidAbstractResult<S>> builder() {
            throw new UnsupportedOperationException("MidAbstractResult is an abstract class");
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends MidAbstractResult<S>> beanType() {
            return (Class) MidAbstractResult.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
