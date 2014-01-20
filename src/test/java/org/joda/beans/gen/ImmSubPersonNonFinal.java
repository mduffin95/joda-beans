/*
 *  Copyright 2001-2014 Stephen Colebourne
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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.google.common.collect.ImmutableList;

/**
 * Mock immutable person JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(hierarchy = "immutable")
public class ImmSubPersonNonFinal extends ImmPersonNonFinal {

    /** The middle name. */
    @PropertyDefinition
    private final String middleName;
    /** The list of addresses. */
    @PropertyDefinition
    private final ImmutableList<Address> addressList;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ImmSubPersonNonFinal}.
     * @return the meta-bean, not null
     */
    public static ImmSubPersonNonFinal.Meta meta() {
        return ImmSubPersonNonFinal.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmSubPersonNonFinal.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @return the builder, not null
     */
    public static ImmSubPersonNonFinal.Builder builder() {
        return new ImmSubPersonNonFinal.Builder();
    }

    /**
     * Restricted constructor.
     * @param builder  the builder to copy from, not null
     */
    protected ImmSubPersonNonFinal(ImmSubPersonNonFinal.Builder builder) {
        super(builder);
        this.middleName = builder.middleName;
        this.addressList = (builder.addressList != null ? ImmutableList.copyOf(builder.addressList) : null);
    }

    @Override
    public ImmSubPersonNonFinal.Meta metaBean() {
        return ImmSubPersonNonFinal.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the middle name.
     * @return the value of the property
     */
    public String getMiddleName() {
        return middleName;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the list of addresses.
     * @return the value of the property
     */
    public ImmutableList<Address> getAddressList() {
        return addressList;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Override
    public ImmSubPersonNonFinal clone() {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmSubPersonNonFinal other = (ImmSubPersonNonFinal) obj;
            return JodaBeanUtils.equal(getMiddleName(), other.getMiddleName()) &&
                    JodaBeanUtils.equal(getAddressList(), other.getAddressList()) &&
                    super.equals(obj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash += hash * 31 + JodaBeanUtils.hashCode(getMiddleName());
        hash += hash * 31 + JodaBeanUtils.hashCode(getAddressList());
        return hash ^ super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(96);
        buf.append("ImmSubPersonNonFinal{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    @Override
    protected void toString(StringBuilder buf) {
        super.toString(buf);
        buf.append("middleName").append('=').append(JodaBeanUtils.toString(getMiddleName())).append(',').append(' ');
        buf.append("addressList").append('=').append(JodaBeanUtils.toString(getAddressList())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmSubPersonNonFinal}.
     */
    public static class Meta extends ImmPersonNonFinal.Meta {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code middleName} property.
         */
        private final MetaProperty<String> middleName = DirectMetaProperty.ofImmutable(
                this, "middleName", ImmSubPersonNonFinal.class, String.class);
        /**
         * The meta-property for the {@code addressList} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableList<Address>> addressList = DirectMetaProperty.ofImmutable(
                this, "addressList", ImmSubPersonNonFinal.class, (Class) ImmutableList.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, (DirectMetaPropertyMap) super.metaPropertyMap(),
                "middleName",
                "addressList");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -818219584:  // middleName
                    return middleName;
                case -1377524046:  // addressList
                    return addressList;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmSubPersonNonFinal.Builder builder() {
            return new ImmSubPersonNonFinal.Builder();
        }

        @Override
        public Class<? extends ImmSubPersonNonFinal> beanType() {
            return ImmSubPersonNonFinal.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code middleName} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> middleName() {
            return middleName;
        }

        /**
         * The meta-property for the {@code addressList} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<ImmutableList<Address>> addressList() {
            return addressList;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -818219584:  // middleName
                    return ((ImmSubPersonNonFinal) bean).getMiddleName();
                case -1377524046:  // addressList
                    return ((ImmSubPersonNonFinal) bean).getAddressList();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmSubPersonNonFinal}.
     */
    public static class Builder extends ImmPersonNonFinal.Builder {

        private String middleName;
        private List<Address> addressList;

        /**
         * Restricted constructor.
         */
        protected Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        protected Builder(ImmSubPersonNonFinal beanToCopy) {
            this.middleName = beanToCopy.getMiddleName();
            this.addressList = (beanToCopy.getAddressList() != null ? new ArrayList<Address>(beanToCopy.getAddressList()) : null);
        }

        //-----------------------------------------------------------------------
        @SuppressWarnings("unchecked")
        @Override
        public Builder set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case -818219584:  // middleName
                    this.middleName = (String) newValue;
                    break;
                case -1377524046:  // addressList
                    this.addressList = (List<Address>) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        @Override
        public Builder setString(MetaProperty<?> property, String value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public ImmSubPersonNonFinal build() {
            return new ImmSubPersonNonFinal(this);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the {@code middleName} property in the builder.
         * @param middleName  the new value
         * @return this, for chaining, not null
         */
        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        /**
         * Sets the {@code addressList} property in the builder.
         * @param addressList  the new value
         * @return this, for chaining, not null
         */
        public Builder addressList(List<Address> addressList) {
            this.addressList = addressList;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(96);
            buf.append("ImmSubPersonNonFinal.Builder{");
            int len = buf.length();
            toString(buf);
            if (buf.length() > len) {
                buf.setLength(buf.length() - 2);
            }
            buf.append('}');
            return buf.toString();
        }

        @Override
        protected void toString(StringBuilder buf) {
            super.toString(buf);
            buf.append("middleName").append('=').append(JodaBeanUtils.toString(middleName)).append(',').append(' ');
            buf.append("addressList").append('=').append(JodaBeanUtils.toString(addressList)).append(',').append(' ');
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
