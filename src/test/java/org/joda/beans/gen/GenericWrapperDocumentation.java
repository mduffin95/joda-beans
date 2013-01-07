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

import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class GenericWrapperDocumentation<T extends Address> extends Documentation<Wrapper<T>> {

    /** The name. */
    @PropertyDefinition
    private String name;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code GenericWrapperDocumentation}.
     * @param <R>  the bean's generic type
     * @return the meta-bean, not null
     * @deprecated use {@link #meta(Class)}
     */
    @SuppressWarnings("rawtypes")
    @Deprecated
    public static GenericWrapperDocumentation.Meta meta() {
        return GenericWrapperDocumentation.Meta.INSTANCE;
    }
    /**
     * The meta-bean for {@code GenericWrapperDocumentation}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R extends Address> GenericWrapperDocumentation.Meta<R> meta(Class<R> cls) {
        return GenericWrapperDocumentation.Meta.INSTANCE;
    }
    static {
        JodaBeanUtils.registerMetaBean(GenericWrapperDocumentation.Meta.INSTANCE);
    }

    @SuppressWarnings("unchecked")
    @Override
    public GenericWrapperDocumentation.Meta<T> metaBean() {
        return GenericWrapperDocumentation.Meta.INSTANCE;
    }

    @Override
    protected Object propertyGet(String propertyName, boolean quiet) {
        switch (propertyName.hashCode()) {
            case 3373707:  // name
                return getName();
        }
        return super.propertyGet(propertyName, quiet);
    }

    @Override
    protected void propertySet(String propertyName, Object newValue, boolean quiet) {
        switch (propertyName.hashCode()) {
            case 3373707:  // name
                setName((String) newValue);
                return;
        }
        super.propertySet(propertyName, newValue, quiet);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            GenericWrapperDocumentation<?> other = (GenericWrapperDocumentation<?>) obj;
            return JodaBeanUtils.equal(getName(), other.getName()) &&
                    super.equals(obj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash += hash * 31 + JodaBeanUtils.hashCode(getName());
        return hash ^ super.hashCode();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the name.
     * @return the value of the property
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * @param name  the new value of the property
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the the {@code name} property.
     * @return the property, not null
     */
    public final Property<String> name() {
        return metaBean().name().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code GenericWrapperDocumentation}.
     */
    public static class Meta<T extends Address> extends Documentation.Meta<Wrapper<T>> {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code name} property.
         */
        private final MetaProperty<String> name = DirectMetaProperty.ofReadWrite(
                this, "name", GenericWrapperDocumentation.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
            this, (DirectMetaPropertyMap) super.metaPropertyMap(),
                "name");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    return name;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends GenericWrapperDocumentation<T>> builder() {
            return new DirectBeanBuilder<GenericWrapperDocumentation<T>>(new GenericWrapperDocumentation<T>());
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends GenericWrapperDocumentation<T>> beanType() {
            return (Class) GenericWrapperDocumentation.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code name} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> name() {
            return name;
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
